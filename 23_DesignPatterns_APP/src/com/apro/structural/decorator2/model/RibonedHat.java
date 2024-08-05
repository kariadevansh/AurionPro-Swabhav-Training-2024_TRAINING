package com.apro.structural.decorator2.model;

public class RibonedHat extends HatDecorator {

    public RibonedHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getDescription() {
        return hat.getDescription() + " with a stylish ribbon.";
    }
    
    @Override
    public double getPrice() {
		return hat.getPrice()+5;
    	
    }
}


