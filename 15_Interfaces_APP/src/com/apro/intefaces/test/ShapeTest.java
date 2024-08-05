package com.apro.intefaces.test;

import com.apro.interfaces.model.Circle;
import com.apro.interfaces.model.Shape;
import com.apro.interfaces.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape;
		shape= new Circle(10);
		shape.area();
		shape.volume();
		shape= new Triangle(11,10);
		shape.area();
		
		Circle c1 = new Circle(10);
		c1.volume();
		
	}
}
