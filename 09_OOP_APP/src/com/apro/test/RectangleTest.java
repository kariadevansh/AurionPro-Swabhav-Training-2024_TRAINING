package com.apro.test;

import java.util.Scanner;

import com.apro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		System.out.println("Enter the dimensions of the  Rectangle1 : \n1.height\n2.width");
		int h = sc.nextInt();
		int w = sc.nextInt();
		r1.setHeight(h);
		r1.setWidth(w);
		r1.getHeight();;
		r1.getWidth();
		int area1 = r1.area();
		System.out.println("The Area is :"+ area1);
		
		System.out.println("\nEnter the dimensions of the Rectangle2: \n1.height\n2.width");
		Rectangle r2 = new Rectangle();
		h = sc.nextInt();
		w = sc.nextInt();
		r2.setHeight(h);
		r2.setWidth(w);
		r2.getHeight();;
		r2.getWidth();
		int area2 = r2.area();
		System.out.println("The Area is :"+ area2);
		
		sc.close();
		

	}

}
