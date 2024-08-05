package com.apro.creational.abstractFactory.model;

public class MarutiFactory implements ICarFactory{
	private static ICar car;
	@Override
	public ICar makeCar() {
		car = new Maruti();
		return car;
	}

}
