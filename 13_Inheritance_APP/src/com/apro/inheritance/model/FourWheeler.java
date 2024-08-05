package com.apro.inheritance.model;

public class FourWheeler extends Vehicle{


	private static double mileage;
	public FourWheeler(String name , double mileage) {
		super(name);
		this.mileage = mileage;
	}
	
	public  double getMileage() {
		return mileage;
	}

	public  void setMileage(double mileage) {
		this.mileage = mileage;
	}
}
