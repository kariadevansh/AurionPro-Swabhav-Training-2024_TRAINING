package com.apro.creation.prototype.model;

public class Car implements Cloneable {
    private String make;
    private String model;
    private int year;
    private boolean hasSunroof;

    public Car(String make, String model, int year, boolean hasSunroof) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hasSunroof = hasSunroof;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    // Clone method
    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hasSunroof=" + hasSunroof +
                '}';
    }
}
