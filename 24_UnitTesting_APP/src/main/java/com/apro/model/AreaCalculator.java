package com.apro.model;

public class AreaCalculator {
	
	double calculateCircleArea(int radius ) {
		return 3.14*radius*radius;
	}
	
	double calculateRectangleArea(int length, int breadth) {
		return length*breadth;
	}
	
	double calculateTrianlgeeArea(int height, int base) {
		return 0.5*height*base;
	}

}
