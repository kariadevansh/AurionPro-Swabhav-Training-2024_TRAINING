package com.apro.lists.model;

public class Car {
	private int carID;
	private String companyName;
	private double mileage;
	private double price;
	
	public Car(int carID, String companyName, double mileage, double price) {
		this.carID = carID;
		this.companyName = companyName;
		this.mileage = mileage;
		this.price = price;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\ncarID :" + carID + "\ncompanyName :" + companyName + "\nmileage :" + mileage + "\nprice :" + price;
	}

	
}
