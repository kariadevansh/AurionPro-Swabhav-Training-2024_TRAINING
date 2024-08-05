package com.apro.srp.solutions.model;

public class CalculateSimpleInterest {
	private FixedDeposit fd;
	
	public CalculateSimpleInterest(FixedDeposit fd) {
		this.fd = fd;
	}
	
	
	GetInterstRate rate = new GetInterstRate(fd);
	
	public double calculateSimpleInterest() {
		return (fd.getPrincipal()*fd.getDuration()*rate.getFestivalInterestRates())/100;
	}
}
