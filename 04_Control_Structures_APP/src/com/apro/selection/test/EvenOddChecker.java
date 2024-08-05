package com.apro.selection.test;

import java.util.Scanner;

public class EvenOddChecker {
	
	public void Check(int number1) {
		if(number1%2 ==0) {
			System.out.println(" The number is EVEN.");
		}else {
			System.out.println("The number is ODD");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers:");
		int number1 = sc.nextInt();
		EvenOddChecker ob1 = new EvenOddChecker();
		ob1.Check(number1);
		
		sc.close();
	}

}
