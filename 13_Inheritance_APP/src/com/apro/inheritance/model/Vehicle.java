package com.apro.inheritance.model;

public class Vehicle {
	private String companyName;
	
	public Vehicle(String name) {
		this.companyName = name;
	}
	public  String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
