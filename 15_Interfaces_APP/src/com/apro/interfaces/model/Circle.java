package com.apro.interfaces.model;

public class Circle implements Shape{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void area() {
		System.out.println("area of circle is "+(3.14*radius*radius));
		
	}
	@Override
	public void volume() {
		System.out.println("Inside CIrcle Volume");
	}

}
