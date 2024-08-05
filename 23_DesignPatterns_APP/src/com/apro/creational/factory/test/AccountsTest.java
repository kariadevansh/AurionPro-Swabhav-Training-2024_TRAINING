package com.apro.creational.factory.test;

import java.util.Scanner;

import com.apro.creational.factory.model.CreateAccount;
import com.apro.creational.factory.model.IAccount;

public class AccountsTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gve account details:\n1.accNo\n2.name\n3.balance");
		int accountNo = scanner.nextInt();
		String name = scanner.next();
		double balance = scanner.nextDouble();
		
		System.out.println("enter account type :");
		String accountType = scanner.next();
		
		IAccount newAccount; 
		newAccount =CreateAccount.createAccount(accountNo, name, balance, accountType);
		newAccount.creditAmount(100);
		newAccount.debitAmount(500);
		
	}
}
