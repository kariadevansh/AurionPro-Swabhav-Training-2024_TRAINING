package com.apro.arrays.test;

import java.util.Scanner;

public class ArrayInOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for(int i =0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the array is:");
		for(int i =0; i<size;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		sc.close();
	}
}
