package com.apro.creational.abstractFactory.model;

public class CreateCurrentAccount implements IAccountType{
	private IAccount account;
	@Override
	public IAccount createAccount(int accountNo, String name , double balance) {
		account = new CurrentAccount(accountNo,name,balance);
		return account;
	}

}
