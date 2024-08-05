package com.apro.lamdas.test;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Integer> randomNumberSupplier = () -> (int)(Math.random()*100);
		
		System.out.println("Random Number generated : "+randomNumberSupplier.get());

	}

}
