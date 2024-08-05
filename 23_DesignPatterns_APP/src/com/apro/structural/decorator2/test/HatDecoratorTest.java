package com.apro.structural.decorator2.test;

import com.apro.structural.decorator2.model.GoldenHat;
import com.apro.structural.decorator2.model.IHat;
import com.apro.structural.decorator2.model.PremiumHat;
import com.apro.structural.decorator2.model.RibonedHat;
import com.apro.structural.decorator2.model.StandardHat;

public class HatDecoratorTest {
	public static void main(String[] args) {
		IHat standardHat = new StandardHat();
		System.out.println("Standard Hat:");
		System.out.println("Name: " + standardHat.getName());
		System.out.println("Price: $" + standardHat.getPrice());
		System.out.println("Description: " + standardHat.getDescription());

		IHat ribonedStandardHat = new RibonedHat(standardHat);
		System.out.println("\nRiboned Standard Hat:");
		System.out.println("Name: " + ribonedStandardHat.getName());
		System.out.println("Price: $" + ribonedStandardHat.getPrice());
		System.out.println("Description: " + ribonedStandardHat.getDescription());

		
		IHat goldenPremiumHat = new GoldenHat(new PremiumHat());
		System.out.println("\nGolden Premium Hat:");
		System.out.println("Name: " + goldenPremiumHat.getName());
		System.out.println("Price: $" + goldenPremiumHat.getPrice());
		System.out.println("Description: " + goldenPremiumHat.getDescription());

	}
}
