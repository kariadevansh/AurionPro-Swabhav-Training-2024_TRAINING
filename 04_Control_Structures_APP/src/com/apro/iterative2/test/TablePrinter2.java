package com.apro.iterative2.test;



public class TablePrinter2 {
	public static void main(String[] args) {
		int table= 1;
		for(int j = 1; j<=10;j++) {
			for(int i= 1;i<=10 ; i++ ) {
				table =i*j;
				System.out.print(table +"\t");
			}
			System.out.println("\n");
		}

	}
}
