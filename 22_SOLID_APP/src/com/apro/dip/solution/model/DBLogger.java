package com.apro.dip.solution.model;

public class DBLogger implements ILogger{
	private String err;

	@Override
	public void Log(String err) {
		System.out.println("Logged in Database : "+err);
	}
	
}
