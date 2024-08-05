package com.arpo.model;

public class AccountCounter {
	private static int accountCount = 0;
	private static int accountNo =1;
	{
		accountCount++;
		accountNo++;
		System.out.println("current count :"+accountCount);
	}
	public static void display() {
		System.out.println(accountCount);
	}
}
