package com.apro.iterative.test;

import java.util.Scanner;

public class PalindromChecker {

	public static void main(String[] args) {
		int reverse =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");
		int number = sc.nextInt();
		int temp = number;
		while(number>0) {
			reverse = reverse*10 +number%10;
			number /=10; // removing the last digit
		} 
		if(reverse == temp)
			System.out.println("The number "+temp+" is a palindrom");
		else
			System.out.println("The number "+temp+" is not a palindrom");
		
		sc.close();
	}

}
