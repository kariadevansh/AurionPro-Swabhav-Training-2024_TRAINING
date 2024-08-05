package com.apro.model;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 boolean values");
	    boolean a = sc.nextBoolean();
	    boolean b = sc.nextBoolean();

	    System.out.println("boolean value of a is: " + a);
	    System.out.println("boolean value of b is: " + b);
	    System.out.println("Logical AND : a && b: " + (a && b));
	    System.out.println("Logical OR: a || b: " + (a || b));
	    System.out.println("NOT :!a: " + !a);
	    System.out.println("NOT :!b: " + !b);
	    
	    sc.close();
	}
}

