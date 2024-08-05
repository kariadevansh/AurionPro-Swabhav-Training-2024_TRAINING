package com.apro.srp.solutions.model;

public class Circle implements Shape{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14*(Math.pow(radius, 2));
	}
	

}
