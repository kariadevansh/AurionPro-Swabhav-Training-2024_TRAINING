package com.apro.creational.abstractFactory.model;

public class SavingsAccount implements IAccount{
	private int accountNo;
	private String name;
	private double balance;
	
	public SavingsAccount(int accountNo, String name, double balance) {
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

	@Override
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void creditAmount(double creditAmount) {
		System.out.println("after credit the balance is : "+(balance+creditAmount));
		setBalance(balance+creditAmount);
	}
	@Override
	public void debitAmount(double debitAmount) {
		System.out.println("after debit the balance is :"+(balance-debitAmount));
		setBalance(balance-debitAmount);
	}

	
}
