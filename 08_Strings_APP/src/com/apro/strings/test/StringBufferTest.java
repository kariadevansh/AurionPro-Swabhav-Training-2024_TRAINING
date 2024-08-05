package com.apro.strings.test;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer name1 = new StringBuffer("Devansh");
		System.out.println(name1.hashCode());
		
		name1 = name1.append("Karia");
		System.out.println(name1.hashCode());
		
		// Strings made using buffer are mutable
	}

}
