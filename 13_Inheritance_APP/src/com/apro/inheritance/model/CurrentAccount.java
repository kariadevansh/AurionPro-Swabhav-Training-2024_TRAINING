package com.apro.inheritance.model;

public class CurrentAccount extends Account{
	private double OVER_DRAFT_LMT;

	public CurrentAccount(int accountNo, String name, double balance, double oVER_DRAFT_LMT) {
		super(accountNo, name, balance);
		OVER_DRAFT_LMT = oVER_DRAFT_LMT;
	}

	public double getOVER_DRAFT_LMT() {
		return OVER_DRAFT_LMT;
	}

	public void setOVER_DRAFT_LMT(double oVER_DRAFT_LMT) {
		OVER_DRAFT_LMT = oVER_DRAFT_LMT;
	}

	@Override
	public String toString() {
		return "\n[OVER_DRAFT_LMT = " + OVER_DRAFT_LMT + ",\nAccountNo = " + getAccountNo()
				+ ",\nName = " + getName() + ",\nBalance = " + getBalance() + "]";
	}
	
	
}
