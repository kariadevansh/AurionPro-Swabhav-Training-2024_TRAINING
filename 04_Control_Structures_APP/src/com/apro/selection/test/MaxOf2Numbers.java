package com.apro.selection.test;

import java.util.Scanner;

public class MaxOf2Numbers {
	public void Check(int number1, int number2) {
		if(number1> number2) {
			System.out.println("The max number is :"+number1);
		}else {
			System.out.println("The max number is :"+number2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 2 numbers:");
		int number1 = sc.nextInt();
		int number2 =sc.nextInt();
		MaxOf2Numbers ob1 = new MaxOf2Numbers();
		ob1.Check(number1, number2);
		
		sc.close();
	}
}
