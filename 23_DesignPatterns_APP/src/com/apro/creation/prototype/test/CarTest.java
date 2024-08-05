package com.apro.creation.prototype.test;

import com.apro.creation.prototype.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Car prototypeCar = new Car("Toyota", "Camry", 2022, true);

		Car clonedCar1 = prototypeCar.clone();
		clonedCar1.setModel("Corolla");

		Car clonedCar2 = prototypeCar.clone();
		clonedCar2.setYear(2023);

		System.out.println("Prototype Car: " + prototypeCar);
		System.out.println("Cloned Car 1: " + clonedCar1);
		System.out.println("Cloned Car 2: " + clonedCar2);
		System.out.println("Prototype Car: " + prototypeCar);

	}
}
