package com.apro.structural.decorator.model;

public class OilChange implements ICarService{
	private ICarService car;
	
	public OilChange(ICarService car) {
		this.car = car;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 500+	car.getCost();
	}
}
