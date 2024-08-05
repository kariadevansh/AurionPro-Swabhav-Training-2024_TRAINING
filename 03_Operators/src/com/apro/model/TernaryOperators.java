package com.apro.model;

import java.util.Scanner;

public class TernaryOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println("Different ways ternary operators can be use:");
		
        int max = (number1 > number2) ? number1 : number2;
        System.out.println("If (number1 > number 2) is true then we assign the value of number1 to the variable max");
        System.out.println("else we assign the value of number2 to the variable max");
        // Print the largest number
        System.out.println("Maximum is = " + max);
        

        int min = (number1 < number2) ? number1 : number2;
        // Print the largest number
        System.out.println("Minimum is = " + min);
        sc.close();
	}
}
