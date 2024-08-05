package com.apro.lamdas.test;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> squareNumberConsumer = (Integer number) -> System.out.println("Square of number :" + (int) Math.pow(number, 2));

		squareNumberConsumer.accept(9);

		Consumer<Integer> factorialConsumber = (Integer number) -> {
			long fact = 1;
			if (number <= 0) {
				System.out.println("Invalid number");
			}
			for (int i = number; i > 0; i--) {
				fact *= i;
			}
			System.out.println("Factorial is :" + fact);
		};

		factorialConsumber.accept(5);
		
		Consumer<Integer> primeNumberConsumer =(Integer number)->{
			boolean flag = false;
			for(int i = 2; i<Math.sqrt(number);i++) {
				if(number % i == 0) {
					flag = true;
					break;
				}
			}
			if(flag == true) {
				System.out.println("Not prime");
			return;
			}
			System.out.println(number+ " is Prime");
		};
		
		primeNumberConsumer.accept(5);

	}

}
