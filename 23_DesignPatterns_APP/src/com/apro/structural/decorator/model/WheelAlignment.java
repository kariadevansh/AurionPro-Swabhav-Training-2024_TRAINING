package com.apro.structural.decorator.model;

public class WheelAlignment implements ICarService{
	private ICarService car;
	
	public WheelAlignment(ICarService car) {
		this.car = car;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 700+	car.getCost();
	}
}
