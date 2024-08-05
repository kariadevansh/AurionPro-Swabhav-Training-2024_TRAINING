package com.apro.behavioural.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.apro.behavioural.observer.model.Account;
import com.apro.behavioural.observer.model.EmailNotifier;
import com.apro.behavioural.observer.model.INotifiers;
import com.apro.behavioural.observer.model.SMSNotifier;
import com.apro.behavioural.observer.model.WhatsappNotifier;

public class AccountTest {
	public static void main(String[] args) {

		List<INotifiers> notifiers = new ArrayList<INotifiers>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lets get u started");
		System.out.println("Enter account number:");
		int accountNo = scanner.nextInt();
		System.out.println("Enter your name :");
		String name = scanner.next();
		System.out.println("Enter your balance :");
		double balance = scanner.nextDouble();
		
		selectNotifiers(scanner, notifiers);
		
		Account account = new Account(accountNo,name,balance,notifiers);
		
		menuDriver2(scanner,account);
	}
	
	private static void menuDriver2(Scanner scanner,Account account) {
		boolean flag =true;
		while(flag == true) {
			System.out.println("\nnow\n1.Check Balance\n2.Credit\n3.Debit\n4.Exit");
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
	private static void selectNotifiers(Scanner scanner, List<INotifiers> notifiers) {

		System.out.println("Select mode of notification");
		System.out.println("Would you like SMS service?\nYes\nOr\nNo");
		String choice = scanner.next();
		if(choice.equalsIgnoreCase("yes")) {
			notifiers.add(new SMSNotifier());
		}
		System.out.println("Would you like Email service?\nYes\nOr\nNo");
		choice = scanner.next();
		if(choice.equalsIgnoreCase("yes")) {
			notifiers.add(new EmailNotifier());
		}
		System.out.println("Would you like Whatsapp service?\nYes\nOr\nNo");
		choice = scanner.next();
		if(choice.equalsIgnoreCase("yes")) {
			notifiers.add(new WhatsappNotifier());
		}
	}

}
