package com.apro.polymorphism.model;

public class BoxWeight extends Box{
	private int weight;
	public BoxWeight(int weight, int length, int width, int height) {
		super(length,width,height);
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "BoxWeight [weight = " + weight + ", Length = " + getLength() + ", Width = " + getWidth()
				+ ", Height = " + getHeight() + "]";
	}
}
