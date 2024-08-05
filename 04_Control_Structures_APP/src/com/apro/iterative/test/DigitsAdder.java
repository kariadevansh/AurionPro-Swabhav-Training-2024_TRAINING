package com.apro.iterative.test;

import java.util.Scanner;

public class DigitsAdder {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		while(number>0) {
			sum +=number%10;
			number /=10;
		}
		System.out.println("the sum of the digits is :"+sum);
		sc.close();
	}
}
