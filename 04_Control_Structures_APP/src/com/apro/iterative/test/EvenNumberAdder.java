package com.apro.iterative.test;

public class EvenNumberAdder {
	public static void main(String[] args) {
		int i =2;
		int sum =0;
		while(i<101) {
			sum+=i;
			i+=2;
		}
		System.out.println("sum of even numbers is :"+sum);
	}
}
