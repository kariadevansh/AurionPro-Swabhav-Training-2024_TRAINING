package com.apro.model;

public class Rectangle {
	private int height;
	private int width;
	
	// setters for each element
	public void setHeight(int h) {
		height = h;
	}
	public void setWidth(int w) {
		width = w;
	}
	
	// getters for each element 
	
	public void getWidth() {
		System.out.println("Width is: "+width);
	}
	public void getHeight() {
		System.out.println("Height is: "+height);
	}
	public int area() {
		int area = height*width;
		return area;
	}
}
