package com.apro.dip.solution.test;

import com.apro.dip.solution.model.DBLogger;
import com.apro.dip.solution.model.FileLogger;
import com.apro.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator tax1 = new TaxCalculator(new DBLogger());
		tax1.calculateTax(100, 0);
		
		TaxCalculator tax2 = new TaxCalculator(new FileLogger());
		tax2.calculateTax(100, 0);
	}
}
