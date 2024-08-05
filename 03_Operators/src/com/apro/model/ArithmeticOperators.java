package com.apro.model;

import java.util.Scanner;


public class ArithmeticOperators {
	public  void Addition(int number1 , int number2) {
		System.out.println("Sum of  "+ number1 + " & "+number2+ " is:");
		System.out.println(number1+number2);
	}
	public  void Subtraction(int number1 , int number2) {
		System.out.println("Difference of  "+ number1 + " & "+number2+ " is:");
		System.out.println(number1-number2);
	}
	public  void Division(double number1 , double number2) {
		if(number2!= 0) {
		System.out.println("Division of  "+ number1 + " by "+number2+ " is:");
		System.out.println(number1/number2);
		}else {
			System.out.println("Exception: no number can be divided by 0");
		}
	}
	public  void Multiplication(int number1 , int number2) {
		System.out.println("Product of  "+ number1 + " & "+number2+ " is:");
		System.out.println(number1*number2);
	}
	public  void Modulus(int number1 , int number2) {
		if(number2!= 0) {
		System.out.println("Modulus of  "+ number1 + " by "+number2+ " is:");
		System.out.println(number1%number2);
		}else {
			System.out.println("Exception: no number can be divided by 0");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArithmeticOperators x = new ArithmeticOperators();
		while(true) {

		System.out.println("Enter the first Number:");
		int number1 =sc.nextInt();
		System.out.println("Select the Arithmatic Operator(enter the serial number):");
		System.out.println("1.Addition \n2.Subtraction \n3.Division \n4.Multiplication \n5.Modulus");
		int func = sc.nextInt();
		System.out.println("Enter the second Number:");
		int number2 = sc.nextInt();	

		switch(func) {
		case 1: 
			x.Addition(number1, number2);
			break;
		case 2:
			x.Subtraction(number1, number2);
			break;
		case 3: 
			x.Division(number1, number2);
			break;
		case 4:
			x.Multiplication(number1, number2);
			break;
		case 5: 
			x.Modulus(number1, number2);
		default:
			System.out.println("select a valid function!");
			break;
		}
		
        System.out.println("Do you want to perform another operation? (y/n)");
        String answer = sc.next();
        if (!answer.equalsIgnoreCase("y")) {
            break; // Exit the loop if user does not want to continue
        }
      }
	   sc.close();
	   System.out.println("Bye bye");
	}
}
