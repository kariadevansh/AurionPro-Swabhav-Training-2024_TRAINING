package com.apro.structural.decorator2.model;

public class StandardHat implements IHat {
    @Override
    public String getName() {
        return "Standard Hat";
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "A basic hat.";
    }
}

