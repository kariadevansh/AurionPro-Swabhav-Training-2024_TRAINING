package com.apro.creational.abstractFactory.test;

import java.util.Scanner;

import com.apro.creational.abstractFactory.model.CreateCurrentAccount;
import com.apro.creational.abstractFactory.model.CreateSavningsAccount;
import com.apro.creational.abstractFactory.model.IAccount;
import com.apro.creational.abstractFactory.model.IAccountType;

public class AccountTest {
	public static void main(String[] args) {
		IAccount account = null;
		IAccountType accountType = null;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Select the type of account :\n1.Savings \n2.Current \n3.EXIT");
		int choice = scanner.nextInt();
		menuDriver(choice,scanner,account,accountType);
		
		scanner.close();
	}
	
	private static void menuDriver(int choice,Scanner scanner, IAccount account, IAccountType accountType) {
		switch(choice) {
		case 1:
			savingsAccount(scanner,account,accountType);
			break;
		case 2:
			currentAccount(scanner,account,accountType);
			break;
		case 3:
			System.out.println("bye bye");
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
	}
	
	private static void savingsAccount(Scanner scanner,IAccount account,IAccountType accountType) {
		System.out.println("lets get u started");
		System.out.println("Enter account number:");
		int accountNo = scanner.nextInt();
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Enter your balance :");
		double balance = scanner.nextDouble();
		
		accountType = new CreateSavningsAccount();
		account = accountType.createAccount(accountNo, name, balance);
		
		System.out.println("Account is created");
		
		menuDriver2(scanner,account);
	}
	
	private static void currentAccount(Scanner scanner,IAccount account,IAccountType accountType) {
		System.out.println("lets get u started");
		System.out.println("Enter account number:");
		int accountNo = scanner.nextInt();
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Enter your balance :");
		double balance = scanner.nextDouble();
		
		accountType = new CreateCurrentAccount();
		account = accountType.createAccount(accountNo, name, balance);
		
		System.out.println("Account is created");
//		System.out.println("now\n1.Check Balance\n2.Credit\n3.Debit\n4.Exit");
//		int choice2 = scanner.nextInt();
		menuDriver2(scanner,account);
	}
	
	
	private static void menuDriver2(Scanner scanner,IAccount account) {
		boolean flag =true;
		while(flag == true) {
			System.out.println("now\n1.Check Balance\n2.Credit\n3.Debit\n4.Exit");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("your balance is: "+account.getBalance());
				break;
			case 2:
				System.out.println("Enter the amount to be credited");
				double creditAmount =  scanner.nextDouble();
				account.creditAmount(creditAmount);
				break;
			case 3:
				System.out.println("Enter the amount to be debited");
				double debitAmount = scanner.nextDouble();
				account.debitAmount(debitAmount);
				break;
			case 4:
				System.out.println("bye bye");
				flag = false;
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}
	
	}
}
