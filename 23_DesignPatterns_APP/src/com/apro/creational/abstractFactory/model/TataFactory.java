package com.apro.creational.abstractFactory.model;

public class TataFactory implements ICarFactory{
	private static ICar car;
	@Override
	public ICar makeCar() {
		car = new Tata();
		return car;
	}

}
