package com.apro.test;

import java.util.Scanner;

public class Main {
	private static int addition(int number1, int number2){
		System.out.println("Sum of  "+ number1 + " & "+number2+ " is:");
		return number1+number2;
	}

	private static int sub(int number1 , int number2) {
		System.out.println("Difference of  "+ number1 + " & "+number2+ " is:");
		return number1-number2;
	}
	private static double div(double number1 , double number2) {
		if(number2!= 0) {
		System.out.println("Division of  "+ number1 + " by "+number2+ " is:");
		double res =number1/number2;
		return res;
		}else {
			System.out.println("Exception: no number can be divided by 0");
			return 0.0;
		}
	}
	private static int mul(int number1 , int number2) {
		System.out.println("Product of  "+ number1 + " & "+number2+ " is:");
		return number1*number2;
	}
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st numbers:");
		number1= sc.nextInt();
		System.out.println("1.Add \n2.Subtract \n3.Divide \n4.Multiply");
		int func = sc.nextInt();
		System.out.println("Enter 2nd numbers:");
		number2 =sc.nextInt();
		
		sc.close();
		
		switch(func) {
		case 1: 
			int x = addition(number1, number2);
			System.out.println(x);
			break;
		case 2:
			int y =sub(number1, number2);
			System.out.println(y);
			break;
		case 3: 
			double z=div(number1, number2);
			System.out.println(z);
			break;
		case 4:
			int m=mul(number1, number2);
			System.out.println(m);
			break;
		default:
			System.out.println("select a valid function!");
			break;
		}
		
	}
	

}
