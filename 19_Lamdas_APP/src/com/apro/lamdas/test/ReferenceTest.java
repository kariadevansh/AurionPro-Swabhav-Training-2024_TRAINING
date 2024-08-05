package com.apro.lamdas.test;

import com.apro.lamdas.model.ITest;
import com.apro.lamdas.model.Reference;

public class ReferenceTest {

	public static void main(String[] args) {
		ITest test = Reference::new;
		method(test);
		
		ITest test1 = Reference::staticPrint;
		
		method(test1);
		
		Reference reference = new Reference();
		
		ITest test2 = reference::print;
		method(test2);
		
	}
	
	private static void method(ITest test) {
		test.display();
	}
}
