package com.apro.selection.test;

import java.util.Scanner;

public class VowelChecker {
	public void Check(char ch) {
		
		switch(ch) {
		case  'a':
		case  'e':
		case  'i':
		case  'o':
		case  'u':
			System.out.println("The character "+ch+" is a vowel");
			break;	
		default:
			System.out.println("The character "+ch+" is not a vowel");
			break;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Char:");
		
		char ch = sc.next().charAt(0);
		VowelChecker ob1 = new VowelChecker();
		ob1.Check(ch);
		
		sc.close();
	}
}
