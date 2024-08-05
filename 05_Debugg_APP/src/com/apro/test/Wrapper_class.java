package com.apro.test;

public class Wrapper_class {
	public static void main(String[] args) {
		int a = 10;
		Integer a_obj =a;  //autoBoxing
		int b = a_obj;  //unBoxing
		int max = a_obj.max(a, 9);
		System.out.println(max);
	}
}
