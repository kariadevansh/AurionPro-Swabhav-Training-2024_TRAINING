package com.apro.test;

import java.util.Scanner;

import com.arpo.model.AccountCounter;

public class AccountCounterTest {
	public static void main(String[] args) {
		System.out.println("enter no.of accounts you can have");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		AccountCounter accounts[] = new AccountCounter[n];
		for(int i = 0;i<n;i++) {
			accounts[i] = new AccountCounter();
		}
		
		System.out.println("final account count is:");
		AccountCounter.display();
		
		
	}
}
