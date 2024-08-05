package com.apro.arrays.test;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int sum = 0;
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for(int i =0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<size;i++) {
			sum+=arr[i];
		}
		System.out.println("the sum of all elemenets of the array is: "+sum);
		sc.close();
	}
}
