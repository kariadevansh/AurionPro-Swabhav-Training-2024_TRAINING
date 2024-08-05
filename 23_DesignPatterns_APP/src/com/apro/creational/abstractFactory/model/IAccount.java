package com.apro.creational.abstractFactory.model;

public interface IAccount {
	double getBalance();
	void creditAmount(double creditAmount);
	void debitAmount(double debitAmount);
}
