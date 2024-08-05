package com.apro.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.apro.streams.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(new Account(101,"yuiji",100000)
				                               ,new Account(102,"tanjiro",10000)
				                               ,new Account(104,"itadori",145000)
				                               ,new Account(201,"gojo",1900200)
				                               ,new Account(111,"itachi",100240)
				                               ,new Account(401,"jiara",14000));
		
		Optional<Account> minAccount = accounts.stream()
		         							   .min((account1,account2)->(int)(account1.getBalance() -account2.getBalance()));
		System.out.println("The account with the min value is: \n"+ minAccount.get());
		

		Optional<Account> maxAccount = accounts.stream()
		         							   .max((account1,account2)->(int)(account1.getBalance() -account2.getBalance()));
		System.out.println("\nThe account with the max value is: \n"+ maxAccount.get());
		
		
		System.out.println("\nThe names which have more than 6 chars :\n");
		accounts.stream()
		        .filter((account)->account.getName().length()>6)
		        .forEach((account)->System.out.println(account.getName()+"\n"));
		
//		double sum  =accounts.stream()
//				             .map((account)-> account.getBalance())
//				             .reduce(0.0,(balance1,balance2)->balance1+balance2);

		double sum  =accounts.stream()
				             .mapToDouble(Account::getBalance)
				             .sum();
		
		System.out.println("\nThe total of balances of all the accounts is :\n"+sum);
	}
}
