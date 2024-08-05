package com.apro.lamdas.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> squareFunction =(Integer number)-> (int)Math.pow(number, 2);
		
		System.out.println("square  of 5  is : "+ squareFunction.apply(5));
		
		BiFunction<Integer,Integer,Double> divisionFunction =(Integer number1, Integer number2)->{
			if(number2<=0) {
				System.out.println("Undefined");
				return null;
			}
			return (double) (number1/number2);
		};
		System.out.println("Divison of 19739 and 173 is : "+ divisionFunction.apply(19739, 173));
	}

}
