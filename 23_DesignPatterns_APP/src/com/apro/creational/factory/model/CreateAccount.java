package com.apro.creational.factory.model;

public class CreateAccount {
	private static  IAccount account;
	
	public static IAccount createAccount(int accountNo, String name , double balance, String accountType) {
		account = null;
		if(accountType.equalsIgnoreCase("savings")) {
			account = new SavingsAccount(accountNo,name,balance);
		}
		if(accountType.equalsIgnoreCase("current")) {
			account = new CurrentAccount(accountNo,name,balance);
		}
		return account;
	}
}
