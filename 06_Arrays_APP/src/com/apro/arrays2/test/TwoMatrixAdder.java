package com.apro.arrays2.test;

import java.util.Scanner;

public class TwoMatrixAdder {
	public static int[][] readMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows and columns::");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		
		System.out.println("Enter the elements :");
		for(int i =0;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
	
		return matrix;
	}
	
	public static void addMatrix(int matrix1[][], int matrix2[][]){
		int result[][] =  new int[matrix1.length][matrix2[0].length];
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices have different dimensions. Cannot perform addition.");
        }else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Result of matrix addition:");
            printMatrix(result);
        }
		
	}
	
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {

		System.out.println("Enter the dimensions of the first matrix:");
		int matrix1[][]= readMatrix();
		
		System.out.println("Enter the dimensions of the second matrix:");
		int matrix2[][]= readMatrix();
		
		addMatrix(matrix1,matrix2);
		
	}
}
