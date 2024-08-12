package com.apro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
public class TransactionProcessor {
    private Connection connection;

    public TransactionProcessor(Connection connection) {
        this.connection = connection;
    }

    public boolean debit(long accountNumber, double amount) throws SQLException {
        double balance = getAccountBalance(accountNumber);
        System.out.println("Debit Attempt - Account Number: " + accountNumber + ", Amount: " + amount + ", Current Balance: " + balance);

        if (balance < amount) {
            System.out.println("Debit Failed - Insufficient funds.");
            throw new SQLException("Insufficient funds for debit operation.");
        }

        String query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setDouble(1, amount);
            stmt.setLong(2, accountNumber);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Debit Successful - Account Number: " + accountNumber + ", Amount: " + amount);
                return true;
            }
        }
        System.out.println("Debit Failed - No rows affected.");
        return false;
    }

    public boolean credit(long accountNumber, double amount) throws SQLException {
        if (amount <= 0) {
            System.out.println("Credit Failed - Amount must be positive.");
            throw new SQLException("Amount for credit operation must be positive.");
        }

        String query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setDouble(1, amount);
            stmt.setLong(2, accountNumber);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Credit Successful - Account Number: " + accountNumber + ", Amount: " + amount);
                return true;
            }
        }
        System.out.println("Credit Failed - No rows affected.");
        return false;
    }

    public boolean transfer(long fromAccountNumber, long toAccountNumber, double amount) throws SQLException {
        // Check sufficient funds
        double balance = getAccountBalance(fromAccountNumber);
        System.out.println("Transfer Attempt - From Account Number: " + fromAccountNumber + ", To Account Number: " + toAccountNumber + ", Amount: " + amount + ", Current Balance: " + balance);

        if (balance < amount) {
            System.out.println("Transfer Failed - Insufficient funds.");
            throw new SQLException("Insufficient funds for transfer.");
        }

        // Deduct from sender's account
        boolean deductSuccess = debit(fromAccountNumber, amount);
        // Add to receiver's account
        boolean addSuccess = credit(toAccountNumber, amount);

        if (deductSuccess && addSuccess) {
            System.out.println("Transfer Successful - From Account Number: " + fromAccountNumber + ", To Account Number: " + toAccountNumber + ", Amount: " + amount);
            return true;
        }
        System.out.println("Transfer Failed - Deduction or addition unsuccessful.");
        return false;
    }

    private double getAccountBalance(long accountNumber) throws SQLException {
        String query = "SELECT balance FROM accounts WHERE account_number = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setLong(1, accountNumber);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    double balance = rs.getDouble("balance");
                    System.out.println("Fetched Balance - Account Number: " + accountNumber + ", Balance: " + balance);
                    return balance;
                }
            }
        }
        System.out.println("Balance Fetch Failed - Account Number: " + accountNumber);
        return 0.0;
    }

    public void logTransaction(Long fromAccountNumber, Double amount, Long toAccountNumber, String transactionType) throws SQLException {
        String query = "INSERT INTO transactions (from_account, to_account, transactions_type, amount, transaction_date) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setLong(1, fromAccountNumber);
            stmt.setObject(2, toAccountNumber); // Can be null for debit/credit
            stmt.setString(3, transactionType);
            stmt.setDouble(4, amount);
            stmt.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Transaction Logged - From Account Number: " + fromAccountNumber + ", Amount: " + amount + ", To Account Number: " + toAccountNumber);
            } else {
                System.out.println("Transaction Logging Failed - No rows affected.");
            }
        }
    }

    public long getAccountNumberByUserId(String userId) throws SQLException {
        String query = "SELECT a.account_number FROM accounts a JOIN customers c ON a.customer_id = c.customer_id WHERE c.user_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(userId));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    long accountNumber = rs.getLong("account_number");
                    System.out.println("Fetched Account Number - User ID: " + userId + ", Account Number: " + accountNumber);
                    return accountNumber;
                }
            }
        }
        System.out.println("Account Number Fetch Failed - User ID: " + userId);
        return -1;
    }
    
    public boolean processTransaction(String userId, String transactionType, String toAccountNumber, double amount) throws SQLException {
	    if (connection == null) {
	        throw new SQLException("Database connection is not available.");
	    }

	    boolean success = false;
	    TransactionProcessor processor = new TransactionProcessor(connection);

	    try {
	        // Start a transaction
	        connection.setAutoCommit(false);

	        // Retrieve the account number of the logged-in user
	        long fromAccountNumber = processor.getAccountNumberByUserId(userId);
	        if (fromAccountNumber == -1) {
	            throw new SQLException("No account found for user ID: " + userId);
	        }

	        if (transactionType.equalsIgnoreCase("credit")) {
	            success = processor.credit(fromAccountNumber, amount);
	        } else if (transactionType.equalsIgnoreCase("debit")) {
	            success = processor.debit(fromAccountNumber, amount);
	        } else if (transactionType.equalsIgnoreCase("transfer")) {
	            long toAccountNumberLong = Long.parseLong(toAccountNumber);
	            success = processor.transfer(fromAccountNumber, toAccountNumberLong, amount);
	        } else {
	            throw new IllegalArgumentException("Invalid transaction type: " + transactionType);
	        }
	        long toAccountNumberLong = 0;
	        // Commit the transaction if successful
	        if (success) {
	            connection.commit();
	            // Log the transaction
	            if (transactionType.equalsIgnoreCase("transfer")) {
	                toAccountNumberLong = Long.parseLong(toAccountNumber);
	                processor.logTransaction(fromAccountNumber, amount, toAccountNumberLong, "transfer");
//	                processor.logTransaction(toAccountNumberLong, amount, fromAccountNumber, "transfer");
	            }else if(transactionType.equalsIgnoreCase("credit")) {
	            	processor.logTransaction(toAccountNumberLong, amount, fromAccountNumber, "credit");
	            }else if(transactionType.equalsIgnoreCase("debit")) {
	            	processor.logTransaction(fromAccountNumber, amount, toAccountNumberLong, "debit");
	            }
	            System.out.println("Transaction processed successfully.");
	        } else {
	            throw new SQLException("Transaction failed.");
	        }
	    } catch (SQLException | IllegalArgumentException e) {
	        // Roll back the transaction in case of an error
	        if (connection != null) {
	            try {
	                connection.rollback();
	            } catch (SQLException rollbackEx) {
	                rollbackEx.printStackTrace();
	            }
	        }
	        e.printStackTrace();
	        throw new SQLException("Error processing transaction", e);
	    } finally {
	        // Restore auto-commit mode
	        if (connection != null) {
	            try {
	                connection.setAutoCommit(true);
	            } catch (SQLException autoCommitEx) {
	                autoCommitEx.printStackTrace();
	            }
	        }
	    }

	    return success;
	}
}

