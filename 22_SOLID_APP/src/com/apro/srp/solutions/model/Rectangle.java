package com.apro.srp.solutions.model;

public class Rectangle implements Shape {
	private int weidth;
	private int height;
	public Rectangle(int weidth, int height) {
		super();
		this.weidth = weidth;
		this.height = height;
	}
	public int getWeidth() {
		return weidth;
	}
	public void setWeidth(int weidth) {
		this.weidth = weidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return weidth*height;
	}
	

	
}
