package com.apro.inheritance.test;

import com.apro.inheritance.model.CurrentAccount;
import com.apro.inheritance.model.SavingsAccount;

public class AccountsTest {

	public static void main(String[] args) {
		CurrentAccount account1 = new CurrentAccount(123,"devansh", 1000000,55000);
		SavingsAccount account2 = new SavingsAccount(124,"devansh", 5000000,100000);
		
		System.out.println("Current account:"+account1);
		System.out.println("\nSavings account:"+account2);

	}

}
