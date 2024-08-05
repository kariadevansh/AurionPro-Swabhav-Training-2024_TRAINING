package com.apro.selection.test;

import java.util.Scanner;

public class MaxOf3Numbers {
	public void Check(int number1, int number2 , int number3) {
		if(number1> number2 && number1>number3) {
			System.out.println("The max number is :"+number1);
		}else if(number2>number1 && number2>number3) {
			System.out.println("The max number is :"+number2);
		}else {
			System.out.println("The max number is :"+number3);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 numbers:");
		int number1 = sc.nextInt();
		int number2 =sc.nextInt();
		int number3 = sc.nextInt();
		MaxOf3Numbers ob1 = new MaxOf3Numbers();
		ob1.Check(number1, number2, number3);
		
		sc.close();
	}
}
