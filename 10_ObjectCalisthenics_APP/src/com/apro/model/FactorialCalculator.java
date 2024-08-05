package com.apro.model;

import java.util.Scanner;

public class FactorialCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		sc.close();
		long factorial = calculateFactorial(number);
		if(factorial == -1) {
			System.out.println("Factorial of Negative number is Undefined");
			return;
		}
		System.out.println("The factorial of the number "+number+" is : "+factorial);
		
	}
	
	private static long calculateFactorial(int number) {
		if(number==0 ||number ==1)
			return 1;
		if(number<0)
			return -1;
		long fact = 1;
		for(long i= 1;i<=number ; i++ ) 
			fact *=i;
		return fact;
	}
}
