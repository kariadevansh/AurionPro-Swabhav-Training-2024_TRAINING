package com.apro.arrays2.test;

import java.util.Scanner;
	
public class Array2D {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows and columns::");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int matrix[][] = new int[rows][columns];
		
		System.out.println("Enter the elements of the 2d array:");
		createMatrixRows(matrix,sc); // we create the  matrix here
		
		System.out.println("Matrix is :");
		printEachRowOfMatrix(matrix);
		sc.close();
	}
	
	private static void readRowElemnts(int matrix[][], int i, Scanner sc){
		for(int j =0;j<matrix[0].length;j++) {
			matrix[i][j]= sc.nextInt();
		}
	}
	
	private static void createMatrixRows(int matrix[][],Scanner sc) {
		for(int i =0;i<matrix.length;i++) {
			readRowElemnts(matrix,i,sc);
		}
	}
	
	private static void printRowElements(int matrix[][], int i) {
		for(int j =0;j<matrix[0].length;j++) {
			System.out.print(matrix[i][j]+"\t");
		}
	}
	
	private static void printEachRowOfMatrix(int matrix[][]) {
		for(int i =0;i<matrix.length;i++) {
			printRowElements(matrix,i);
			System.out.println("\n");
		}
	}
}
