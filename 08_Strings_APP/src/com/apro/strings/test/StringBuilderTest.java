package com.apro.strings.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder name1 = new StringBuilder("Devansh");
		System.out.println(name1.hashCode());
		
		name1.append("Karia");
		System.out.println(name1.hashCode());
		
		// Strings made using buffer are mutable
	}

}
