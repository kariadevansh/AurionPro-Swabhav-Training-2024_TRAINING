package com.apro.dip.solution.model;

public class FileLogger implements ILogger{
	private String err;

	@Override
	public void Log(String err) {
		System.out.println("Logged in File : "+err);
	}
	
}
