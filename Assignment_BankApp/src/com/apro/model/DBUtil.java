package com.apro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.apro.entity.Account;
import com.apro.entity.Customer;
import com.apro.entity.Profile;
import com.apro.entity.Transactions;
import com.apro.entity.Users;

public class DBUtil {
	private Connection connection = null;
	private PreparedStatement prepareStatement = null;
	private Statement statement = null;
	private ResultSet result = null;
	private static DBUtil dbUtil = null;

	private DBUtil() {
	}

	public static DBUtil getDBUtil() {
		if (dbUtil == null) {
			dbUtil = new DBUtil();
		}
		return dbUtil;
	}

	public boolean isConnectionValid() {
		try {
			return connection != null && !connection.isClosed();
		} catch (SQLException e) {
			return false;
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void connectToDb() {
		try {
			// 1. register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. create connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			System.out.println("Connection successful");

			// 3. create statement of connection
			statement = connection.createStatement();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Users validateCredentials(String username, String password, String userType) {
		Users currentUser = null;
		String query = "SELECT * FROM users WHERE username = ? AND password = ? AND user_type=?";
		try {
			prepareStatement = connection.prepareStatement(query);
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			prepareStatement.setString(3, userType);
			result = prepareStatement.executeQuery();
			
			if (result.next()) {
				int user_id =result.getInt("user_id");
				currentUser = new Users(user_id,username,userType);
				return currentUser; // User found
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return currentUser; // User not found
	}
	

	
	public String getUserType(String username) {
		String query = "SELECT user_type FROM users WHERE username = ?";
		try {
			prepareStatement = connection.prepareStatement(query);
			prepareStatement.setString(1, username);
			result = prepareStatement.executeQuery();
			if (result.next()) {
				return result.getString("user_type");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // User type not found
	}

	public boolean addCustomer(String firstName, String lastName, String email, String password) throws SQLException {
		// Ensure the connection is not null and handle transaction management
		if (connection == null) {
			throw new SQLException("Database connection is not available.");
		}

		boolean success = false;
		try {
			// Start a transaction
			connection.setAutoCommit(false);
			System.out.println("Attempting to add customer");

			// Insert into users table and retrieve generated keys
			prepareStatement = connection.prepareStatement(
					"INSERT INTO users (username, password, user_type) VALUES (?, ?, 'customer')",
					Statement.RETURN_GENERATED_KEYS);
			prepareStatement.setString(1, email);
			prepareStatement.setString(2, password);
			int rowsAffected = prepareStatement.executeUpdate();
			System.out.println("Rows affected: " + rowsAffected);

			if (rowsAffected == 0) {
				throw new SQLException("Inserting user failed, no rows affected.");
			}
			// Retrieve the generated user_id
			result = prepareStatement.getGeneratedKeys();
			if (result.next()) {
				int userId = result.getInt(1);
				System.out.println("Generated user_id: " + userId);
				// Insert into customers table
				try (PreparedStatement insertCustomerStmt = connection.prepareStatement(
						"INSERT INTO customers (first_name, last_name, email, password, user_id)  VALUES (?, ?, ?, ?, ?)")) {
					insertCustomerStmt.setString(1, firstName);
					insertCustomerStmt.setString(2, lastName);
					insertCustomerStmt.setString(3, email);
					insertCustomerStmt.setString(4, password);
					insertCustomerStmt.setInt(5, userId);
					int rowsInserted = insertCustomerStmt.executeUpdate();

					// Check if the customer was successfully added
					if (rowsInserted > 0) {
						success = true;
						System.out.println("customer added successfully");
					}
				}
			} else {
				throw new SQLException("User ID retrieval failed.");
			}
			// Commit the transaction
			connection.commit();
		} catch (SQLException e) {
			// Roll back the transaction in case of an error
			if (connection != null) {
				try {
					connection.rollback();
				} catch (SQLException rollbackEx) {
					rollbackEx.printStackTrace();
				}
			}
			e.printStackTrace();
			throw new SQLException("Error adding customer", e);
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

	public List<Customer> getAllCustomers() throws SQLException {
		List<Customer> customers = new ArrayList<>();

		prepareStatement = connection.prepareStatement("SELECT * FROM customers");
		result = prepareStatement.executeQuery();

		while (result.next()) {
			int id = result.getInt("customer_id");
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			String email = result.getString("email");
			String password = result.getString("password");

			PreparedStatement accountStmt = connection.prepareStatement("SELECT * FROM accounts WHERE customer_id = ?");
			accountStmt.setInt(1, id);
			ResultSet accountRs = accountStmt.executeQuery();

			List<Account> accounts = new ArrayList<>();
			while (accountRs.next()) {
				long accountNumber = accountRs.getLong("account_number");
				double balance = accountRs.getDouble("balance");
				accounts.add(new Account(accountNumber, balance));
			}

			Customer customer = new Customer(id, firstName, lastName, email, password);
			customer.setAccounts(accounts); // Ensure accounts are set
			customers.add(customer);
		}

		return customers;
	}

	public List<Customer> getCustomersWithoutAccount() throws SQLException {
		List<Customer> customers = new ArrayList<>();
		String sql = "SELECT * FROM customers WHERE customer_id NOT IN (SELECT DISTINCT customer_id FROM accounts)";

		System.out.println("Executing SQL query: " + sql);

		try {
			connection = getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			System.out.println("Database connection and statement created successfully.");

			while (result.next()) {
				Customer customer = new Customer();
				customer.setId(result.getInt("customer_id"));
				customer.setFirstName(result.getString("first_name"));
				customer.setLastName(result.getString("last_name"));
				customer.setEmail(result.getString("email"));

				System.out.println("Fetched customer: ID=" + customer.getId() + ", FirstName=" + customer.getFirstName()
						+ ", LastName=" + customer.getLastName() + ", Email=" + customer.getEmail());

				customers.add(customer);
			}

			System.out.println("Total customers fetched: " + customers.size());
		} catch (SQLException e) {
			System.err.println("SQL error occurred: " + e.getMessage());
			e.printStackTrace();
			throw e;
		}

		return customers;
	}

	public List<Transactions> getAllTransactions() throws SQLException {
		List<Transactions> transactions = new ArrayList<Transactions>();
		String query = "SELECT * FROM transactions";

		try {
			prepareStatement = connection.prepareStatement(query);
			result = prepareStatement.executeQuery();
			while (result.next()) {
				int transactionId = result.getInt("transaction_id");
				long fromAccount = result.getLong("from_account");
				long toAccount = result.getLong("to_account");
				String transactionType = result.getString("transactions_type");
				double amount = result.getDouble("amount");
				Timestamp transactionDate = result.getTimestamp("transaction_date");

				Transactions transaction = new Transactions(transactionId, fromAccount, toAccount, transactionType,
						amount, transactionDate);
				transactions.add(transaction);
				System.out.println("Transaction retrieved: ID = " + transactionId + ", From = " + fromAccount
						+ ", To = " + toAccount);
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception while retrieving transactions.");
			e.printStackTrace();
			throw new SQLException("Error retrieving transactions", e);
		}

		System.out.println("Total transactions retrieved: " + transactions.size());
		return transactions;
	}

	public List<Transactions> getAllTransactionsOfCustomer(String userId) throws SQLException {
	    List<Transactions> transactions = new ArrayList<>();
	    int id = Integer.parseInt(userId);

	    String customerQuery = "SELECT customer_id FROM customers WHERE user_id = ?";
	    try (PreparedStatement customerStmt = connection.prepareStatement(customerQuery)) {
	        customerStmt.setInt(1, id);
	        try (ResultSet customerResult = customerStmt.executeQuery()) {
	            if (!customerResult.next()) {
	                throw new SQLException("No customer found for user_id: " + userId);
	            }
	            int customerId = customerResult.getInt("customer_id");

	            String accountQuery = "SELECT account_number FROM accounts WHERE customer_id = ?";
	            try (PreparedStatement accountStmt = connection.prepareStatement(accountQuery)) {
	                accountStmt.setInt(1, customerId);
	                try (ResultSet accountResult = accountStmt.executeQuery()) {
	                    if (!accountResult.next()) {
	                        throw new SQLException("No accounts found for customer_id: " + customerId);
	                    }
	                    long accountNumber = accountResult.getLong("account_number");

	                    String transactionQuery = "SELECT * FROM transactions WHERE from_account = ? OR to_account = ?";
	                    try (PreparedStatement transactionStmt = connection.prepareStatement(transactionQuery)) {
	                        transactionStmt.setLong(1, accountNumber);
	                        transactionStmt.setLong(2, accountNumber);
	                        try (ResultSet transactionResult = transactionStmt.executeQuery()) {
	                            while (transactionResult.next()) {
	                                int transactionId = transactionResult.getInt("transaction_id");
	                                long fromAccount = transactionResult.getLong("from_account");
	                                long toAccount = transactionResult.getLong("to_account");
	                                String transactionType = transactionResult.getString("transactions_type");
	                                double amount = transactionResult.getDouble("amount");
	                                Timestamp transactionDate = transactionResult.getTimestamp("transaction_date");

	                                Transactions transaction = new Transactions(transactionId, fromAccount, toAccount, transactionType,
	                                        amount, transactionDate);
	                                transactions.add(transaction);
	                                System.out.println("Transaction retrieved: ID = " + transactionId + ", From = " + fromAccount
	                                        + ", To = " + toAccount);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    } catch (SQLException e) {
	        System.err.println("SQL Exception while retrieving transactions.");
	        e.printStackTrace();
	        throw new SQLException("Error retrieving transactions", e);
	    }

	    System.out.println("Total transactions retrieved: " + transactions.size());
	    return transactions;
	}

	public Customer getCustomerById(String customerId) throws SQLException {
		Customer customer = null;
		String query = "SELECT * FROM customers WHERE id = ?";

		try {
			prepareStatement = connection.prepareStatement(query);
			// Set the customerId parameter
			prepareStatement.setInt(1, Integer.parseInt(customerId));

			// Execute the query

			result = prepareStatement.executeQuery();
			if (result.next()) {
				// Create a Customer object from the result set
				customer = new Customer(result.getInt("id"), result.getString("first_name"),
						result.getString("last_name"), result.getString("email"), result.getString("password"));
			}

		} catch (NumberFormatException e) {
			// Handle invalid customerId format
			e.printStackTrace();
			throw new SQLException("Invalid customer ID format", e);
		} catch (SQLException e) {
			// Handle SQL exceptions
			e.printStackTrace();
			throw new SQLException("Error retrieving customer by ID", e);
		}

		return customer;
	}

	public String generateAccountNumber() throws SQLException {
		if (connection == null) {
			throw new SQLException("Database connection is not available.");
		}

		AccountProcessor generator = new AccountProcessor(connection);
		return generator.generateAccountNumber();
	}

	public boolean addAccount(String customerId, String accountNumber, double initialBalance) throws SQLException {
		if (connection == null) {
			throw new SQLException("Database connection is not available.");
		}
		AccountProcessor generator = new AccountProcessor(connection);

		return generator.addAccount(customerId, accountNumber, initialBalance);
	}
	
	
	public boolean processTransaction(String userId, String transactionType, String toAccountNumber, double amount) throws SQLException {
	    if (connection == null) {
	        throw new SQLException("Database connection is not available.");
	    }

	    boolean success = false;
	    TransactionProcessor processor = new TransactionProcessor(connection);

	    return processor.processTransaction(userId, transactionType, toAccountNumber, amount);
	}

	 public Profile getProfileByUserId(String userId) throws SQLException {
	        Profile profile = new Profile();
	        String query = "SELECT first_name, last_name, email FROM customers WHERE user_id = ?";
	        try (PreparedStatement stmt = connection.prepareStatement(query)) {
	            stmt.setString(1, userId);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                profile.setFirstName(rs.getString("first_name"));
	                profile.setLastName(rs.getString("last_name"));
	                profile.setEmail(rs.getString("email"));
	            }
	        }
	        return profile;
	    }

	 public void updateProfile(String userId, String firstName, String lastName, String password) throws SQLException {
		    // Query to update first name and last name
		    String updateBasicInfoQuery = "UPDATE customers SET first_name = ?, last_name = ? WHERE user_id = ?";
		    
		    // Query to update first name, last name, and password
		    String updateAllInfoQuery = "UPDATE customers SET first_name = ?, last_name = ?, password = ? WHERE user_id = ?";
		    
		    // Determine which query to use based on the password field
		    String queryToUse;
		    if (password != null && !password.trim().isEmpty()) {
		        queryToUse = updateAllInfoQuery;
		    } else {
		        queryToUse = updateBasicInfoQuery;
		    }

		    // Execute the determined query
		    try (PreparedStatement stmt = connection.prepareStatement(queryToUse)) {
		        // Set the common parameters
		        stmt.setString(1, firstName);
		        stmt.setString(2, lastName);
		        
		        // Conditionally set the password field and user_id
		        if (queryToUse.equals(updateAllInfoQuery)) {
		            stmt.setString(3, password);
		            stmt.setString(4, userId);
		        } else {
		            stmt.setString(3, userId);
		        }

		        // Execute the update
		        stmt.executeUpdate();
		    }
		}


}
