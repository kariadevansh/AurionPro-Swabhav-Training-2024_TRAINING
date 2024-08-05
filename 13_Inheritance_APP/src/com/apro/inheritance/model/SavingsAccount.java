package com.apro.inheritance.model;

public class SavingsAccount extends Account{
	private double MIN_BALANCE;



	public SavingsAccount(int accountNo, String name, double balance, double mIN_BALANCE) {
		super(accountNo, name, balance);
		MIN_BALANCE = mIN_BALANCE;
	}

	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(double mIN_BALANCE) {
		MIN_BALANCE = mIN_BALANCE;
	}
	
	@Override
	public String toString() {
		return "\n[MIN_BALANCE= " + MIN_BALANCE + ",\nAccountNo = " + getAccountNo() + ",\nName = "
				+ getName() + ",\nBalance = " + getBalance() + "]";
	}
}
