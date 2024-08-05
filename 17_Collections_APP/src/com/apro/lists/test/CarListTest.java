package com.apro.lists.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.apro.lists.model.Car;

public class CarListTest {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		List<Car> cars = new ArrayList<Car>();
		
		readCarList(scanner, cars);
		
		printCarsList(cars);
		
		findingMaximumMileage(cars);
	}
	
	private static void readCarList(Scanner scanner ,List cars) {
		System.out.println("Enter the number of cars");
		int n = scanner.nextInt();
		
		while(n>0) {
			System.out.println("Enter car Id :");
			int carId = scanner.nextInt();
			System.out.println("Enter companyName :");
			String name = scanner.next();
			System.out.println("Enter mileage :");
			double mileage = scanner.nextDouble();
			System.out.println("Enter price :");
			double price = scanner.nextDouble();
			
			cars.add(new Car(carId,name,mileage,price));
			n--;
		}
	}
	
	private static void printCarsList(List <Car>cars) {
		for(Car car:cars)
			System.out.println(car);
	}
	
	private static void findingMaximumMileage(List<Car> cars) {
		Car maxMileageCar = (Car) cars.get(0);
		for(Car car:cars){
			if(maxMileageCar.getMileage()< car.getMileage())
				maxMileageCar = car;
		}
		System.out.println("The car with maximum mileage is :");
		System.out.println(maxMileageCar);
	}

}
