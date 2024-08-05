package com.apro.iterative2.test;

import java.util.Scanner;

public class TablePrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		int table= 1;
		for(int i= 1;i<=10 ; i++ ) {
			table =i*number;
			System.out.println(number+" x "+ i +"  = "+ table);
		}
		sc.close();
	}
}
