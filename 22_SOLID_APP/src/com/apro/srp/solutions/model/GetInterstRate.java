package com.apro.srp.solutions.model;

public class GetInterstRate {
	private FixedDeposit fd;
	
	public GetInterstRate(FixedDeposit fd) {
		this.fd = fd;
	}
	double rate = 0;
	
	
	public double getFestivalInterestRates() {
		System.out.println(fd.getName()+"  "+ fd.getFestival());
		if(fd.getFestival().equalsIgnoreCase("DIWALI") == true) {
			DiwaliInterest interest = new DiwaliInterest();
			rate = interest.getInterestRate();
			return rate;
		}
		if(fd.getFestival().equalsIgnoreCase("HOLI") == true) {
			HoliInterest interest = new HoliInterest();
			rate = interest.getInterestRate();
			return rate;
		}
		if(fd.getFestival().equalsIgnoreCase("NEWYEAR") == true) {
			NewYearInterest interest = new NewYearInterest();
			rate = interest.getInterestRate();
			return rate;
		}
		if(fd.getFestival().equalsIgnoreCase("OTHER") ==  true) {
			OtherInterest interest = new OtherInterest();
			rate = interest.getInterestRate();
			return rate;
		}
		return rate;
	}
	
}
