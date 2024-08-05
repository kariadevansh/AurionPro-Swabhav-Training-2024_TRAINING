package com.apro.arrays2.test;

import java.util.Scanner;

public class MaxElementFinder {
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
		sc.close();
		int maxElement = 0;
		
		for(int i =0;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				if(matrix[i][j]>= maxElement) {
					maxElement = matrix[i][j];
				}
			}
		}
		System.out.println("the max element is :"+maxElement);
	}
}
