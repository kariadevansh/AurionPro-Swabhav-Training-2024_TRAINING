package com.apro.selection.test;

import java.util.Scanner;

public class PositiveNegativeChecker {
	public void Check(int number1) {
		if(number1>=0) {
			System.out.println(" The number is Positive.");
		}else {
			System.out.println("The number is Negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers:");
		int number1 = sc.nextInt();
		PositiveNegativeChecker ob1 = new PositiveNegativeChecker();
		ob1.Check(number1);
		
		sc.close();
	}

}
