package com.apro.model;

public class Operations {
	public int addition(int a ,int b) {
		return a+b;
	}
	
	public int substraction(int a,int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public double division(int a ,int b) {
		if(b<=0) {
			System.out.println("invalid input");
			return 0;
		}
		return a/b;
		
	}
}
