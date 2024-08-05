package com.apro.selection.test;

import java.util.Scanner;

public class TemperatureConverter {
	public void Check(double temperature, int choice) {
	
		switch(choice) {
		case 1:
			System.out.println("--Celsius to Fahrenheit--");
			temperature = (temperature*9/5)+32;
			System.out.println("The temperatur after conversion is :"+temperature+" F");
			break;
		case 2:
			System.out.println("--Fahrenheit to Celsius--");
			temperature = ((temperature-32)*9)/5;
			System.out.println("The temperatur after conversion is :"+temperature+" C");
			break;
			
		case 3:
			System.out.println("-- Celsius to Kelvin--");
			temperature = temperature + 273.15;
			System.out.println("The temperatur after conversion is :"+temperature+" K");
			break;
			
		case 4:
			System.out.println("--Kelvin to Celsius--");
			temperature = temperature - 273.15;
			System.out.println("The temperatur after conversion is :"+temperature+"°C");
			break;
			
		case 5:
			System.out.println("--Fahrenheit to Kelvin--");
			temperature =((temperature -32)*5)/9 + 273.15 ;
			System.out.println("The temperatur after conversion is :"+temperature+" K");
			break;
			
		case 6:
			System.out.println("--Kelvin to Fahrenheit--");
			temperature = ((temperature -273.15)*9)/5 + 32;
			System.out.println("The temperatur after conversion is :"+temperature+" F");
			break;
			
		default:
			System.out.println("Select a valid option");
			break;
			
			
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        TemperatureConverter  ob1 = new TemperatureConverter();
        ob1.Check(temperature, choice);
        
        scanner.close();
        
	}
}
