package com.apro.structural.decorator.test;

import com.apro.structural.decorator.model.CarDecorator;
import com.apro.structural.decorator.model.CarInspection;
import com.apro.structural.decorator.model.ICarService;
import com.apro.structural.decorator.model.OilChange;
import com.apro.structural.decorator.model.WheelAlignment;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService car1 = new CarInspection() ;
		car1= new CarDecorator(car1);
		System.out.println("Service charges for car1 :$"+car1.getCost());
		 
		car1 = new OilChange(car1);
		System.out.println("Service charges for car1 :$"+car1.getCost());
		
		car1 = new WheelAlignment(car1);
		System.out.println("Service charges for car1 :$"+car1.getCost());
		
	}
}
