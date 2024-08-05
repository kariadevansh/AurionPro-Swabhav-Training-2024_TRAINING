package com.apro.iterative.test;

import java.util.Scanner;

public class NumberReverser {
	public static void main(String[] args) {
		int reverse =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");
		int number = sc.nextInt();
		while(number>0) {
			reverse = reverse*10 +number%10;
			number /=10; // removing the last digit
		} 
		System.out.println("The reverse is :"+reverse);
		sc.close();
	}
}
