package com.apro.structural.facade2.model;

public class Projector implements IMachine{

	@Override
	public void on() {
		System.out.println("Projector is on");
	}

}
