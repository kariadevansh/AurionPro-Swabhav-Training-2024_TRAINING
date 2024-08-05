package com.apro.arrays.test;

import java.util.Scanner;

public class CheckPresentArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for(int i =0; i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		int count =0;
		System.out.println("Enter the element u want to sheck if is present in the array");
		int search = scanner.nextInt();
		for(int i =0;i<size;i++) {
			if(arr[i] == search) {
				System.out.println("Found the number at: "+i+" postion");
				count++;
			}
		}
		if(count ==0)
			System.out.println(" not found");
		else
			System.out.println("No.of time fund the number :"+count);

		scanner.close();
	}
}
