package com.apro.iterative.test;

import java.util.Scanner;

public class PerfectNumberChecker {
	public static void main(String[] args) {
		int perfect =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");
		int number = sc.nextInt();
		int temp = number;
		int divisibles = number/2;
		while(divisibles >0) {
			if(number%divisibles == 0) {
				perfect += divisibles;
			}
			divisibles--;
			
		}
		if(perfect == temp) 
			System.out.println("The number : "+temp+ " is a perfect number");
		else
			System.out.println("The number : "+temp+ " is not a perfect number");
		
		sc.close();
	}
}
