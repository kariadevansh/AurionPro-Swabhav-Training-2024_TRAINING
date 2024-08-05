package com.apro.creational.factory.model;

public class CarFactory {
	private static ICar car;
	private CarName name;
	
	public static ICar makeCar(String carName) { //, CarName name
		car = null;
		if(carName.equalsIgnoreCase("maruti")) 
			car = new Maruti();
		if(carName.equalsIgnoreCase("tata")) 
			car = new Tata();
		if(carName.equalsIgnoreCase("mahindra")) 
			car = new Mahindra();
		
//		if(name.toString().contains(carName.toUpperCase()))
			
		return car;
	}
}
