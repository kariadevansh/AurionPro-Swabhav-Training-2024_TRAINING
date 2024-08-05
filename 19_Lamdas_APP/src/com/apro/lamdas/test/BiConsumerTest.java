package com.apro.lamdas.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> additionConsumer = (Integer number1, Integer number2) -> System.out.println("Addition is :"+(number1+number2));;
		additionConsumer.accept(10, 20);
	}

}
