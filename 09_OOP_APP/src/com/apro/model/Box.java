package com.apro.model;

public class Box {
	private int width ;
	private int length;
	private int depth ;
	 // setter methods for each element
	public Box() {
		width=10;
		length=10;
		depth=10;
	}
	
	public Box(int width, int length,int depth) {
		this.width=width;
		this.length= length;
		this.depth=depth;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	// getter methods for each element
	public void getWidth() {
		System.out.println("Width is: "+this.width);
	}
	public void getLength() {
		System.out.println("Lenght is: "+this.length);
	}
	public void getDepth() {
		System.out.println("Depth is: "+this.depth);
	}
	
	public int baseArea() {      // here we return the int (data) value
		int area = width*length;
		return area;
	}
	public void volume() {    // here we don't return anything
		int volume = width*length*depth;
		System.out.println("The volume of the box is : "+volume);
	}
	
	
}
