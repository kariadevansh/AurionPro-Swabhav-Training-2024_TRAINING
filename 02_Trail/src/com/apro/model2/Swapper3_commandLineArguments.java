package com.apro.model2;

public class Swapper3_commandLineArguments {
	public static void main(String[] args) {
		int num1 =Integer.parseInt( args[0]);

		int num2 = Integer.parseInt(args[1]);
	
		System.out.println("before swapping:");
		System.out.println("1st no. is :"+num1+" & 2nd no. is :"+num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("after swapping:");
		System.out.println("1st no. is :"+num1+" & 2nd no. is :"+num2);
		
	}
}
