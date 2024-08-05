package com.apro.structural.decorator2.model;

public class PremiumHat implements IHat {
    @Override
    public String getName() {
        return "Premium Hat";
    }

    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "A high-quality hat with premium features.";
    }
}
