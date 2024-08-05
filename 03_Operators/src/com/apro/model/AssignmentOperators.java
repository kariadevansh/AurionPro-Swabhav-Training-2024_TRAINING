package com.apro.model;

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int number = sc.nextInt();
		
		System.out.println("The different assignment operators are:");
		int b = number;
		System.out.println("simple assignment operator(=)");
		System.out.println("Here we use =  and assign the values of variable number:"+ number+ " to the variable b :"+b);
		
		System.out.println(" compound assignment operators:");
		System.out.println("enter any 2 numbers :");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println(" += operator");
		int temp = number1;
		temp += number2;
		System.out.println("this operator adds the second number to the first one and assigns the result to the variable 'number1':"+temp);
		
		System.out.println("\n -= operator");
		 temp = number1;
		 temp -= number2;
		System.out.println("this operator subtracts the second number from the first one and assigns the result to the variable 'number1':"+temp);
		
		System.out.println("\n *= operator");
		 temp = number1;
		 temp *= number2;
		System.out.println("this operator multiplies the second number with the first one and assigns the result to the variable 'number1':"+temp);
		
		System.out.println("\n /= operator");
		 temp = number1;
		 temp /= number2;
		System.out.println("this operator divides the first number by the second one and assigns the result to the variable 'number1':"+temp);
		
		System.out.println("\n %= operator");
		temp = number1;
		temp %= number2;
		System.out.println("this operator takes modulus of the first number w.r.t the second one and assigns the result to the 'number1' :"+temp);
		
		sc.close();	
	}
}
