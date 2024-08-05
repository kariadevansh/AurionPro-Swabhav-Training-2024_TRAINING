package com.apro.strings.test;

public class StringTest {

	public static void main(String[] args) {
		String name1 = "Devansh";
		String name2 = "Devansh";
//		name1 = name1 ="karia";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1 == name2);
		
		String name3 = new String("Devansh");
		System.out.println(name3.hashCode());
		
		String name4 = new String("Devansh");
		System.out.println(name4.hashCode());
		
		System.out.println(name3== name4);
		
		// string made using String are immutable
		// every string we create using direct literals it goes in a stringpool inside heap
		
	}

}
