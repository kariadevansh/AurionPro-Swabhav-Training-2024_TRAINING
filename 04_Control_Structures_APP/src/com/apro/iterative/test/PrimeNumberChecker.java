package com.apro.iterative.test;

import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");
		int number = sc.nextInt();
		int i =2;
		while(i<number) {
			if(number%i ==0) {
				break;
			}
			i++;
		}
		if(i>=number)
			System.out.println("the number : "+number+" is a prime number");
		else
			System.out.println("the number : "+number+" is not a prime number");

		sc.close();
	}
}
