package com.apro.model2;

import java.util.Scanner;

public class MathFunctions {
	public  void add(int number1 , int number2) {
		System.out.println("Sum of  "+ number1 + " & "+number2+ " is:");
		System.out.println(number1+number2);
	}
	public  void sub(int number1 , int number2) {
		System.out.println("Difference of  "+ number1 + " & "+number2+ " is:");
		System.out.println(number1-number2);
	}
	public  void div(double number1 , double number2) {
		if(number2!= 0) {
		System.out.println("Division of  "+ number1 + " by "+number2+ " is:");
		System.out.println(number1/number2);
		}else {
			System.out.println("Exception: no number can be divided by 0");
		}
	}
	public  void mul(int number1 , int number2) {
		System.out.println("Product of  "+ number1 + " & "+number2+ " is:");
		System.out.println(number1*number2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathFunctions x = new MathFunctions();
		while(true) {

		System.out.println("Enter the first Number:");
		int number1 =sc.nextInt();
		System.out.println("Select the Arithmatic Function(enter the serial number):");
		System.out.println("1.Add \n2.Subtract \n3.Divide \n4.Multiply");
		int func = sc.nextInt();
		System.out.println("Enter the second Number:");
		int number2 = sc.nextInt();	

		switch(func) {
		case 1: 
			x.add(number1, number2);
			break;
		case 2:
			x.sub(number1, number2);
			break;
		case 3: 
			x.div(number1, number2);
			break;
		case 4:
			x.mul(number1, number2);
			break;
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

