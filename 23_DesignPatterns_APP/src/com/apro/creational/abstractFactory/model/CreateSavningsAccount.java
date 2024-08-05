package com.apro.creational.abstractFactory.model;

public class CreateSavningsAccount implements IAccountType{
	private static IAccount account;
	@Override
	public IAccount createAccount(int accountNo, String name , double balance) {
		account = new SavingsAccount(accountNo,name,balance);
		return account;
	}

}
