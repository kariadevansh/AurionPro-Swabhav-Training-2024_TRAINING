package com.apro.structural.adapter.model;

public class Biscuits implements IItems{
	private String name;
	private double mrp;
	
	public Biscuits(String name, double mrp) {
		this.name = name;
		this.mrp = mrp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMRP() {
		return mrp;
	}

	public void setMRP(double mrp) {
		this.mrp = mrp;
	}
	

	@Override
	public String toString() {
		return "Biscuits\t\t" + name + "\t\t$" + mrp;
	}

	@Override
	public String getItemName() {
		return name;
	}
	@Override
	public double getItemPrice() {
		return mrp;
	}
}
