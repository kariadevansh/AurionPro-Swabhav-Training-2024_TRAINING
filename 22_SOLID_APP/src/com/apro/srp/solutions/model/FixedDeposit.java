package com.apro.srp.solutions.model;

// create new package for OCP and move it there with all its codes
public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private String festival;
	public FixedDeposit(int accountNumber, String name, double principal, int duration,String festival) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	public String getFestival() {
		return festival;
	}
	public void setFestival(String festival) {
		this.festival = festival;
	}
	public FixedDeposit() {
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
//	public double getInterestRates() {
//		switch(festival) {
//		case NEWYEAR:
//			return 8;
//		case DIWALI:
//			return 8.5;
//		case HOLI:
//			return 7.5;
//		case OTHERS:
//			return 6.5;
//			
//		default :
//			return 0;
//		}
//	}
	
//	public double calculateSimpleInterest() {
//		double rate = getInterestRates();
//		return (principal*duration*rate)/100;
//	}
}
