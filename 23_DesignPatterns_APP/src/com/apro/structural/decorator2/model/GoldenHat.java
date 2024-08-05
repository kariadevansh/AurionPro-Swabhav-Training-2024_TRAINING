package com.apro.structural.decorator2.model;

public class GoldenHat extends HatDecorator {

    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " with a golden touch.";
    }
    @Override
    public double getPrice() {
		return hat.getPrice()+50;
    	
    }
}
