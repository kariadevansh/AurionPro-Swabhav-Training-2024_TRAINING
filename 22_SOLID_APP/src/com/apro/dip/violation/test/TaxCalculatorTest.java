package com.apro.dip.violation.test;

import com.apro.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator tax1 = new TaxCalculator(100,0);
		System.out.println(tax1.calculateTax());
		
	}

}
