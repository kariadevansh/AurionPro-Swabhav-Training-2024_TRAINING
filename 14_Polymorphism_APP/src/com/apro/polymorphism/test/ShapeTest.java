package com.apro.polymorphism.test;

import com.apro.polymorphism.model.Circle;
import com.apro.polymorphism.model.Rectangle;
import com.apro.polymorphism.model.Shape;
import com.apro.polymorphism.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(10);
		shape.area();
		shape= new Rectangle(10, 20);
		shape.area();
		shape= new Triangle(10, 25);
		shape.area();
	}

}
