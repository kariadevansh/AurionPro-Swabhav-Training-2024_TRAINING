package com.apro.creational.factory.model;

public class CurrentAccount implements IAccount{
	private int accountNo;
	private String name;
	private double balance;
	private double overdraftLMT = 1000;
	private double tempLimit = overdraftLMT;
	
	
	public CurrentAccount(int accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getOverdraftLMT() {
		return overdraftLMT;
	}


	public void setOverdraftLMT(double overdraftLMT) {
		this.overdraftLMT = overdraftLMT;
	}


	public double getTempLimit() {
		return tempLimit;
	}


	public void setTempLimit(double tempLimit) {
		this.tempLimit = tempLimit;
	}


	@Override
	public void creditAmount(double creditAmount) {
		if(creditAmount<=0) {
    		System.out.println("Invalid amount");
    		return;
    	}
    	if(creditAmount<balance) {
    		System.out.println("after credit balance is :"+(balance+creditAmount));
    		setBalance(balance+creditAmount);
    		return;
    	}
    	if(balance == 0 && tempLimit<=overdraftLMT) {  
    		tempLimit += creditAmount;
    		System.out.println("The amount "+ creditAmount+" is added to your overdraft.Current overdraft : "+ tempLimit);
    		setTempLimit(tempLimit);
    		return;
    	}
	}
	@Override
	public void debitAmount(double debitAmount) {
		if(debitAmount<=0) {
    		System.out.println("Enter a valid amount");
    		return;
    	}
    	if(balance<debitAmount) {
    		System.out.println("insufficient balance");
    		whenBalanceIsNotSufficient(debitAmount,balance);
    		return;
    	}
    	if(balance==0 && tempLimit>0) {
    		tempLimit -= debitAmount;
             System.out.println("Amount $"+debitAmount+" debited successfully from your overdraft value.Balance overdraft value id: $"+tempLimit);
             System.out.println("The amount credited from the overdraft must be squared off within 15 days at interest of 2%.");
             return;
    	}
    	if(balance<=0 || tempLimit<=0) {
    		System.out.println("You dont have enough balance and have reached your overdraft limit");
    		return;
    	}
    	 balance -= debitAmount;
         System.out.println("Amount $" + debitAmount + " debited successfully. Updated balance: $" + balance);    
	}
	
	public void whenBalanceIsNotSufficient(double debitAmount,double balance) {
    	System.out.println("Amount $" + balance + " debited successfully. Updated balance: $" + 0.0);
    	debitAmount -= balance;
    	
    	if(debitAmount > overdraftLMT) {
    		System.out.println("You dont have enough balance and have reached your overdraft limit");
    		return;
    	}
    	tempLimit -= debitAmount;
    	
    	 System.out.println("Amount $"+debitAmount+" debited successfully from your overdraft value.Balance overdraft value id: $"+tempLimit);
         System.out.println("The amount credited from the overdraft must be squared off within 15 days at interest of 2%.");
         setTempLimit(tempLimit);
    }
	
	

	
}
