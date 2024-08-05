package com.apro.inheritance.model;

public class Car extends FourWheeler{
	private static double price;
	
	public Car( String name, double mileage, double price) {
		super(name,mileage);
		this.price = price;
	}

	public  double getPrice() {
		return price;
	}

	public  void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [Price= " + getPrice() + ", Mileage = " + getMileage() + ", CompanyName = "
				+ getCompanyName() +"]";
	}
}
