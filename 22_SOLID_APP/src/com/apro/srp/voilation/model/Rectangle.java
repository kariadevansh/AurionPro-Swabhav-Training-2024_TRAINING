package com.apro.srp.voilation.model;

public class Rectangle {
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
	
	public int getArea() {
		return weidth*height;
	}
	
	
}
