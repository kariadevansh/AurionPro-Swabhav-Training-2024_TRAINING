package com.apro.ExceptionHandling.model;

public class AgeNotValidException extends RuntimeException{
	private int age;
	
	public AgeNotValidException(int age) {
		this.age = age;
	}

	public String getMessage() {
		return "Age cant be less than 18 yrs!! You have entered :"+age;
	}
}
