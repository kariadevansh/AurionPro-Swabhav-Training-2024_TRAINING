package com.apro.model;

import java.util.Scanner;

public class UnaryOperators {
	public  void UnaryMinus(int number){
		int temp = -number;
		System.out.println("The number "+number+" after using unary minus operator is: "+temp);
	}

	public  void PostIncrement(int number) {
		int temp = number;
		number++;
		System.out.println("Using post-increment operator on "+ temp +" we get :"+ number);
	}
	public  void PostDecrement(int number) {
		int temp = number;
		number--;
		System.out.println("Using post-increment operator on "+ temp +" we get :"+ number);
	}
	public  void PreIncrement(int number) {
		int temp = number;
		++number;
		System.out.println("Using pre-increment operator on "+ temp +" we get :"+ number);
	}
	public  void PreDecrement(int number) {
		int temp = number;
		--number;
		System.out.println("Using pre-decrement operator on "+ temp +" we get :"+ number);
	}
	public void BitwiseCompliment(int number) {
		System.out.println("Using bitwise compliment on "+number+ "we get :"+ ~number);
	}
	
	public void Not(boolean condition) {
		System.out.println("After using the NOT operator the original condition :"+condition+ " becomes: "+ !condition);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UnaryOperators x = new UnaryOperators();
		while(true) {
			System.out.println("Enter a Number or Condition(true/false):");
			String str = sc.next();
			if(str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
				boolean temp = Boolean.parseBoolean(str);
				x.Not(temp);
			}else {
				int number = Integer.parseInt(str);
				System.out.println("Select the Unary Operator(enter the serial number):");
				System.out.println("1.Unary minus \n2.Post Increment  \n3.Post Decrement  \n4.Pre Increment \n5.Pre Decrement \n6.Bitwise Compliment");
				int func = sc.nextInt();
				switch(func) {
				case 1:
					x.UnaryMinus(number);
					break;
				case 2:
					x.PostIncrement(number);
					break;
				case 3:
					x.PostDecrement(number);
					break;
				case 4:
					x.PreIncrement(number);
					break;
				case 5:
					x.PreDecrement(number);
					break;
				case 6:
					x.BitwiseCompliment(number);
					break;
				default:
					System.out.println(" Select a valid option");
					break;	
				}
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
