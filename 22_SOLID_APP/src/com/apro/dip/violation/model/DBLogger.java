package com.apro.dip.violation.model;

public class DBLogger {
	private String err;
	
	public void Log(String err) {
		System.out.println("Logged to Database : "+ err);
	}
}
