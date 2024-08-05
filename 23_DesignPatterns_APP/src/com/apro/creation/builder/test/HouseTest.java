package com.apro.creation.builder.test;

import com.apro.creation.builder.model.House;

public class HouseTest {
	public static void main(String[] args) {
		 House basicHouse = new House.Builder(3)  // Required parameter: numberOfRooms
	                .build();
	        System.out.println(basicHouse);

	        // Creating a House with all specified attributes
	        House luxuryHouse = new House.Builder(5)
	                .setRoofType("Metal")
	                .setHasGarden(true)
	                .setHasGarage(true)
	                .setColor("Blue")
	                .build();
	        System.out.println(luxuryHouse);

	        // Creating a House with a custom garden and color
	        House customHouse = new House.Builder(4)
	                .setHasGarden(true)
	                .setColor("Green")
	                .build();
	        System.out.println(customHouse);
	}
}
