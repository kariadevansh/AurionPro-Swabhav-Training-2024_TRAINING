package com.apro.model;

import java.util.Scanner;

public class Operators_test{
	public void ShortAND(int a , int b , int c) {
		System.out.println("Short Circuit AND");
		System.out.println((a>b)&&(b<c));
	}
	public void ShortOR(int a , int b , int c) {
		System.out.println("\nShort Circuit OR");
		System.out.println((a>b)||(b<c));
	}
	public void AND(int a , int b , int c) {
		System.out.println("\nAND");
		System.out.println((a>b)&(b<c));
	}
	public void OR(int a , int b , int c) {
		System.out.println("\nOR");
		System.out.println((a>b)|(b<c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 numbers:");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();		
		int number3 = sc.nextInt();
		
		Operators_test ob1 = new Operators_test();
		ob1.ShortAND(number1, number2, number3);
		ob1.ShortOR(number1, number2, number3);
		ob1.AND(number1, number2, number3);
		ob1.OR(number1, number2, number3);
		
		sc.close();
		}

}
