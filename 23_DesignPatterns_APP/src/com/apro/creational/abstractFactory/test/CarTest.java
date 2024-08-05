package com.apro.creational.abstractFactory.test;

import com.apro.creational.abstractFactory.model.ICar;
import com.apro.creational.abstractFactory.model.ICarFactory;
import com.apro.creational.abstractFactory.model.MahindraFactory;
import com.apro.creational.abstractFactory.model.MarutiFactory;
import com.apro.creational.abstractFactory.model.TataFactory;

public class CarTest {
	public static void main(String[] args) {
		ICar car;
		ICarFactory marutiFactory = new MarutiFactory();
		car = marutiFactory.makeCar();
		
		car.start();
		car.stop();
		
		ICarFactory mahindraFactory = new MahindraFactory();
		car= mahindraFactory.makeCar();
		
		car.start();
		car.stop();
		
		ICarFactory tataFactory = new TataFactory();
		car= tataFactory.makeCar();
		
		car.start();
		car.stop();
	}
}
