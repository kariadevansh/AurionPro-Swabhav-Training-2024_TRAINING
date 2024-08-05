package com.apro.lamdas.test;

import com.apro.lamdas.model.IAddition;

public class IAdditionTest {
	public static void main(String[] args) {
//		int number1 = 10;
//		int number2 = 20;
		IAddition adder = (int number1, int number2)->  number1+number2;
		System.out.println(adder.addition(10 , 20));
		
//		IAddition adder =()-> System.out.println(number1+number2);
//		adder.add();
	}
}
