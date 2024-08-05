package com.apro.model2;

import java.util.Scanner;

public class Swapper1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of 1st number :");
		int num1 = sc.nextInt();
		System.out.println("enter value of 2nd number :");
		int num2 = sc.nextInt();
		
		
		System.out.println("before swapping:");
		System.out.println("1st no. is :"+num1+" 2nd no. is :"+num2);
		
		int temp = num1;
		num1= num2;
		num2 = temp;
		
		System.out.println("after swapping:");
		System.out.println("1st no. is :"+num1+" 2nd no. is :"+num2);
		sc.close();
	}
}
