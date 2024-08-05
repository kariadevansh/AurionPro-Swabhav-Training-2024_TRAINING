package com.apro.streams.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,34,21,4,53,1,11,23,45,2,99);
		
//		Stream<Integer> numberStream = numbers.stream();
		
		
		System.out.println("Square of all numbers :");
		List<Integer> squaredNumbers =numbers.stream()
											 .map((number)->(int)Math.pow(number, 2))
											 .collect(Collectors.toList());
		
		
		squaredNumbers.forEach((number)->System.out.println(number));

		// we use filter to filter the data based on some condition(boolean)
		// we use collect to store any data from a stream into a list
		System.out.println("\nPrint odd numbers greater than 25");
		List<Integer>filteredNumbers =numbers.stream()
			   .filter((number)->(number%2)!=0)
			   .filter((number)->(number>25))
			   .collect(Collectors.toList());
		
		// we use foreach to run a for loop on the data
		filteredNumbers.forEach((number)->System.out.print(number+"\t"));
		
		
		int sum = numbers.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println("\n\nsum is: "+sum);
		
		
		List<Integer>sortedNumbers = numbers.stream()
											.sorted()
								            .collect(Collectors.toList());
		
		System.out.println("in decending order");
		sortedNumbers.stream()
					 .sorted(Comparator.reverseOrder())
					 .forEach((number)->System.out.println(number));
		
		System.out.println("in ascendin order");
		sortedNumbers.stream()
					 .forEach((number)->System.out.println(number));
		
		
		System.out.println("in decending order using collections");
		sortedNumbers.stream()
					 .sorted(Collections.reverseOrder())
					 .forEach((number)->System.out.println(number));
		
		
		System.out.println("The top 3 elemnets");
		sortedNumbers.stream()
		 .sorted(Comparator.reverseOrder())
		 .limit(3)
		 .forEach((number)->System.out.println(number));
		
		
		// we use Optional in cases where we are working with comparators
		System.out.println("max element of the list(without sorting)");
		Optional<Integer>max = numbers.stream()
									  .max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("\nMax is : "+max.get());
		
		
		System.out.println("Finding min element (without sorting");
		Optional<Integer> min = numbers.stream()
				                       .min((number1,number2)->number1-number2);
		
		if(min.isPresent())
			System.out.println("\n Min is : "+ min.get());
		

	}

}
