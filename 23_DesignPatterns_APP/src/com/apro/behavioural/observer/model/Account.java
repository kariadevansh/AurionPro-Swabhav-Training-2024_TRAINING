package com.apro.behavioural.observer.model;

import java.util.List;

public class Account {
	private int accountNo;
	private String Name;
	private double balance;
	private List<INotifiers> notifiers;
	private String typeOfTransaction;
	
	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}
	public void setTypeOfTransaction(String typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}
	public Account(int accountNo, String name, double balance, List<INotifiers> notifiers) {
		super();
		this.accountNo = accountNo;
		Name = name;
		this.balance = balance;
		this.notifiers = notifiers;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<INotifiers> getNotifier() {
		return notifiers;
	}
	public void setNotifier(List<INotifiers> notifiers) {
		this.notifiers = notifiers;
	}
	
	public void creditAmount(double creditAmount) {
		setTypeOfTransaction("credit");
		if(creditAmount<=0)
			throw new ValidAmountException(creditAmount);
		System.out.println("after credit the balance is : "+(balance+creditAmount)+"\ns");
		setBalance(balance+creditAmount);
		
		for(INotifiers notifier: notifiers) {
			notifier.notify(this, getTypeOfTransaction(), creditAmount);
		}
	}
	
	
    public void debitAmount(double debitAmount) {
    	setTypeOfTransaction("debit");
    	if(debitAmount<=0) {
    		throw new ValidAmountException(debitAmount);
    	}
        if (balance < debitAmount){
            System.out.println("Cannot debit amount greater than your balance.");
            throw new InsufficientBalanceException(getBalance());
        }
		System.out.println("after debit the balance is :"+(balance-debitAmount)+"\n");
		setBalance(balance-debitAmount);
		for(INotifiers notifier: notifiers) {
			notifier.notify(this, getTypeOfTransaction(), debitAmount);
		}	
    }
	
    public void addNotifier(INotifiers notifier) {
    	notifiers.add(notifier);
    	System.out.println("Added successfully");
    }
	
}
