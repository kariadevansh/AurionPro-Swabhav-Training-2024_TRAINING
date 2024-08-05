package com.apro.creational.factory.test;

import com.apro.creational.factory.model.CarFactory;
import com.apro.creational.factory.model.ICar;
import com.apro.creational.factory.model.Mahindra;
import com.apro.creational.factory.model.Maruti;
import com.apro.creational.factory.model.Tata;

public class CarTest {
	public static void main(String[] args) {
//		ICar car1 = new Maruti();
//		ICar car2 = new Tata();
//		ICar car3 = new Mahindra();
//		
//		car1.start();
//		car1.stop();
//		
//		car2.start();
//		car2.stop();
//		
//		car3.start();
//		car3.stop();
		
		ICar car;
		car = CarFactory.makeCar("TATA");
		car.start();
		car.stop();
		
		car = CarFactory.makeCar("MahIndra");
		car.start();
		car.stop();
		
		car = CarFactory.makeCar("Maruti");
		car.start();
		car.stop();
	}
}
