package com.apro.behavioural.interpreter.model;

public class Context {
    public void turnOnLight(String room) {
        System.out.println("Turning on the light in the " + room);
    }

    public void turnOffLight(String room) {
        System.out.println("Turning off the light in the " + room);
    }

    public void setThermostat(int temperature) {
        System.out.println("Setting the thermostat to " + temperature + " degrees");
    }
}
