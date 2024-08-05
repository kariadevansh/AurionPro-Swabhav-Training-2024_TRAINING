package com.apro.structural.facade2.model;

public class DvdPlayer implements IMachine{

	@Override
	public void on() {
		System.out.println("DvdPlayer is on");
	}
	
	public void setMovie(String movie) {
		System.out.println("Movie playing :\n"+movie);
	}

}
