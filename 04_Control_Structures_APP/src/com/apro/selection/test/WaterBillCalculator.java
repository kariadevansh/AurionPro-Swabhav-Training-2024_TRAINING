package com.apro.selection.test;

import java.util.Scanner;

public class WaterBillCalculator {
	public void Calculate(int units) {
		int charge = 75;
		if(units<=100) {
			charge +=(units*5);
		}else if(units <=250) {
			charge += 100*5;
			charge +=((units-100)*10);
		}
		else {
			charge += 100*5;
			charge += 150*10;
			charge +=((units-250)*20);
		}
		
		System.out.println("The total water bill is : Rs."+charge);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units consumed:");
		int units =sc.nextInt();
		
		WaterBillCalculator bill1 = new WaterBillCalculator();
		bill1.Calculate(units);
		
		sc.close();
	}

}
