package com.apro.iterative2.test;

public class Pattern1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println("\n");
		}
	}
}
