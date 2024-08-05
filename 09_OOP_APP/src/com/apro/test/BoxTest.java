package com.apro.test;

import java.util.Scanner;

import com.apro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Box box1 = new Box();
		System.out.println("Enter the dimensions of the box1: \n1.Width\n2.Lenght\n3.Depth");
//		box1.width= sc.nextInt();
//		box1.length= sc.nextInt();
//		box1.depth= sc.nextInt();  //  these can be used only when the contents in Box class are public and not private
		int width =sc.nextInt(); 
		int length =sc.nextInt();
		int depth =sc.nextInt();
//		box1.setWidth(width);
//		box1.setLength(length);
//		box1.setDepth(depth);
		Box box1 =new Box(width,length,depth); // parameterized constructor

		box1.getWidth();
		box1.getLength();
		box1.getDepth();
		box1.volume();
		
		Box box2 = new Box();
		
		System.out.println("\nEnter the dimensions of the box2: \n1.Width\n2.Lenght\n3.Depth");
//		box2.width =sc.nextInt();
//		box2.length =sc.nextInt();
//		box2.depth=sc.nextInt();
		width =sc.nextInt(); 
		length =sc.nextInt();
		depth =sc.nextInt();
		box2.setWidth(width);
		box2.setLength(length);
		box2.setDepth(depth);

		box2.getWidth();
		box2.getLength();
		box2.getDepth();
		int area = box2.baseArea();
		System.out.println("the base area of box1 is : "+area);
		
//		System.out.println(box1.baseArea());
		sc.close();
		
	}

}
