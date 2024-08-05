package com.apro.lamdas.test;

import com.apro.lamdas.model.ISayable;

public class ISayableTest {

	public static void main(String[] args) {
		
		ISayable sayable =() -> System.out.println("Inside Sayable!!!");  
		// with the help of this we dont need to create a class to implement an interface , we can directly define the methods of the interface in the variable itself
		
		sayable.say();
	}

}
