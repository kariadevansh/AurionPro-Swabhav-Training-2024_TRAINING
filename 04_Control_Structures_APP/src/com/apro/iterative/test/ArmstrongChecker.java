package com.apro.iterative.test;

import java.util.Scanner;

public class ArmstrongChecker {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");
		int number = sc.nextInt();
		int ogNumber = number;
		int power =0;
		while(number>0) {
			power++;  // each time the loop runs power is incremented and in the last run the value of power == digits of the number
			number /=10;
		}   // this loop is use for calculating the digits of the number user entered 
		//we store it in power for further calculations
		number = ogNumber;
		while(number>0) {
			sum +=Math.pow(number%10, power);  // here we are taking the last digit , cubing it and adding it to the sum
			number /=10; // removing the last digit
		} // as the loop runs , each digit is cubed and added to the sum
		if(sum == ogNumber ) // now we check if the sum and the number is equal or not
			System.out.println("the number "+ ogNumber +" is an Armstraong number");
		else 
			System.out.println("the number "+ ogNumber +" is not an Armstraong number");
		sc.close();
	}
}
