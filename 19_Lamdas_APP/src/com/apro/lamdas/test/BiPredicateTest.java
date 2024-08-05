package com.apro.lamdas.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		Integer number1 =5;
		Integer number2 =10;
		
		BiPredicate<Integer,Integer> greaterPredicate =(Integer num1, Integer num2)-> (number1>number2);
		
		if(greaterPredicate.test(number1, number2) == true) {
	
			System.out.println(number1 +" is greater than "+ number2);
			return;
		}
		System.out.println(number2 +" is greater than "+ number1);
	}

}
