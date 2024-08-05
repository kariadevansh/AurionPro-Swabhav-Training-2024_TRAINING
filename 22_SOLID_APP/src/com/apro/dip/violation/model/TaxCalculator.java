package com.apro.dip.violation.model;

public class TaxCalculator {
	private DBLogger dblogger;
//
//	public TaxCalculator(DBLogger bdlogger) {
////		super();
//		this.bdlogger = bdlogger;
//	}
	
	private int amount;
	private int rate;
	public TaxCalculator(int amount, int rate) {
		super();
		this.amount = amount;
		this.rate = rate;
	}
	
	public int calculateTax() {
		int tax = 0;
		try {
			tax = amount/rate;
		} catch (Exception e) {
			dblogger.Log("Divided by zero");
		}
		return tax;
	}
	
	
	
}
