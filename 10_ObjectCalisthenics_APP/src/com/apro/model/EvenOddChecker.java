package com.apro.model;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("Number is even");
			return;
		}
		System.out.println("number is odd");

	}

}
