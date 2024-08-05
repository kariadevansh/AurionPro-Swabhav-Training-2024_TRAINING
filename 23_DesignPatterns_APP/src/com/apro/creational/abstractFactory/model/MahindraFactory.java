package com.apro.creational.abstractFactory.model;

public class MahindraFactory implements ICarFactory{
	private static ICar car;
	@Override
	public ICar makeCar() {
		car = new Mahindra();
		return car;
	}

}
