package com.apro.srp.solutions.test;

import com.apro.srp.solutions.model.Circle;
import com.apro.srp.voilation.model.Rectangle;

public class AreaCalculator {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,7);
		System.out.println("For rectangle:\narea is :"+rectangle.getArea());
		
		Circle circle = new Circle(7);
		System.out.println("\nFor circle:\narea is :"+circle.getArea());
	}

}
