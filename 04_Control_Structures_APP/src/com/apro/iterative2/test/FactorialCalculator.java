package com.apro.iterative2.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		long factorial = 1;
		for(int i= 1;i<=number ; i++ ) {
			factorial *=i;
		}
		
		System.out.println("The factorial of the number "+number+" is : "+factorial);
		sc.close();
	}

}
