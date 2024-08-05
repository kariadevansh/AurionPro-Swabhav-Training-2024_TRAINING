package com.apro.arrays2.test;

import java.util.Scanner;

public class ElementMatrixSearcher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows and columns::");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int matrix[][] = new int[rows][columns];
		
		System.out.println("Enter the elements of the matrix:");
		createMatrixRows(matrix,sc);
		
		int count=0;
		System.out.println("Enter the element to be searched: ");
		int search = sc.nextInt();
		
		sc.close();
		for(int i =0;i<rows;i++) {
			for(int j = 0; j<columns; j++) {
				searchElement(matrix,i,j,search,count);
			}
		}
		
		if(count == 0) {
			System.out.println("element not found");
		}else {
			System.out.println("No.of time element appeared is:"+count);
		}
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
	
	private static int searchElement(int matrix[][], int i, int j, int search, int count) {
		if(matrix[i][j]==search) {
			System.out.println("Found the number at: "+i+" postion");
			count++;
		}
		return count;
	}

}
