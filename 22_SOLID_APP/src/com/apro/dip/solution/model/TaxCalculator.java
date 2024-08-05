package com.apro.dip.solution.model;

import com.apro.dip.solution.model.ILogger;

public class TaxCalculator {
	private ILogger ilogger;

	
	public TaxCalculator(ILogger ilogger) {
		super();
		this.ilogger = ilogger;
	}

	public ILogger getIlogger() {
		return ilogger;
	}

	public void setIlogger(ILogger ilogger) {
		this.ilogger = ilogger;
	}
	
	public void calculateTax(int amount, int rate) {
		try {
			System.out.println(amount/rate);
		} catch (Exception e) {
			new DBLogger().Log("divided by zero");
			new FileLogger().Log("divided by zero");
		}
	}
}
