package com.apro.iterative.test;

public class ConsecutiveNumberAdder {
	public static void main(String[] args) {
		int i =1;
		int sum =0;
		while(i<101) {
			sum+=i;
			i++;
		}
		System.out.println("sum is :"+sum);
	}
}
