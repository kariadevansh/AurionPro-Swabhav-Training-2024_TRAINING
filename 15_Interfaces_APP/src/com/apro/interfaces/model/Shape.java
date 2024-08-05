package com.apro.interfaces.model;

public interface Shape {
	void area();
	
	default void volume(){
		System.out.println("Inside Shape Volume");
	}
}
