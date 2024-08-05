package com.apro.arrays2.test;

import java.util.Scanner;

public class MatrixElementsAdder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows and columns::");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int matrix[][] = new int[rows][columns];
		
		System.out.println("Enter the elements of the 2d array:");
		for(int i =0;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		int sum=0;
		
		sc.close();
		for(int i =0;i<rows;i++) {
			for(int j = 0; j<columns; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println("the sum of all the elements is : "+ sum );
	}
}
