package com.apro.test;

import com.arpo.model.Demo;

public class DemoTest {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.display();
		d1.increment();
		d1.display();
		System.out.println("\n");
		Demo d2 = new Demo();
		d2.display();
		d2.increment();
		d2.display();
		System.out.println("\n");		
		Demo d3 = new Demo();
		d3.display();
		d3.increment();	
		d3.display();
		System.out.println("\n");
	}
	
	static {
		System.out.println("\n1.WE are :");
	}
}
