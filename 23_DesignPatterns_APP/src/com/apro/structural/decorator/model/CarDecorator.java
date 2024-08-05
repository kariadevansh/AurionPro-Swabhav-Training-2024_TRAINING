package com.apro.structural.decorator.model;

public class CarDecorator implements ICarService{
	private ICarService car;
	
	public CarDecorator(ICarService car) {
		this.car = car;
	}


	@Override
	public double getCost() {
		return car.getCost();
	}
	
}
