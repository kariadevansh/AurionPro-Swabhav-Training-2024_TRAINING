package com.apro.creational.abstractFactory.model;

public class Maruti implements ICar{

	@Override
	public void start() {
		System.out.println("Maruti car started");
	}

	@Override
	public void stop() {
		System.out.println("Maruti car Stopped");
	}

}
