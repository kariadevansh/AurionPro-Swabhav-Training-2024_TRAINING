package com.apro.behavioural.interpreter.model;

public class SetThermostat implements Expression {
    private int temperature;

    public SetThermostat(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void interpret(Context context) {
        context.setThermostat(temperature);
    }
}