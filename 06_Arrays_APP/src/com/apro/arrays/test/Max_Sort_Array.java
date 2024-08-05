package com.apro.arrays.test;

//import java.util.Arrays;
import java.util.Scanner;

public class Max_Sort_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		for(int i =0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
//		Arrays.sort(arr); // directly sort in ascending order
		
		for(int i =0;i<size;i++) {
			for(int j=i+1;j<size;j++){
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] =temp;
				}
			}
		}
		
		System.out.println(" the sorted Array in descending order is :");
		for(int i =0; i<size;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\nAnd the max element is :"+arr[size-1]);
		sc.close();
	}
}
