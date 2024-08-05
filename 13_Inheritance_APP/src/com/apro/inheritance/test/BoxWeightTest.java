package com.apro.inheritance.test;

import java.util.Scanner;

import com.apro.inheritance.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter weight, length, width & height");
		int weight = sc.nextInt();
		int l = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		BoxWeight box1 = new BoxWeight(weight,l,w,h);
		sc.close();
		System.out.println(box1);

	}

}
