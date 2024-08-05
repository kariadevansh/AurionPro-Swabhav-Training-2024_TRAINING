package com.apro.creational.abstractFactory.model;

public interface IAccountType {

	IAccount createAccount(int accountNo, String name, double balance);
}
