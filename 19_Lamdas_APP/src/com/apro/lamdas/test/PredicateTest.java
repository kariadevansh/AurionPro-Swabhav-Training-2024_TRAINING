package com.apro.lamdas.test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> evenPredicate = (Integer number) -> (number % 2 == 0);
		
		System.out.println("Is the number even ? \n"+evenPredicate.test(4));
		


	}

}
