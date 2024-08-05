package com.apro.srp.voilation.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
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
	public double getPrinciple() {
		return principal;
	}
	public void setPrinciple(double principal) {
		this.principal = principal;
	}
	public int getDuratiion() {
		return duration;
	}
	public void setDuratiion(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestival() {
		return festival;
	}
	
	public double getInterestRates() {
		switch(festival) {
		case NEWYEAR:
			return 8;
		case DIWALI:
			return 8.5;
		case HOLI:
			return 7.5;
		case OTHERS:
			return 6.5;
			
		default :
			return 0;
		}
	}
	
	public double calculateSimpleInterest() {
		double rate = getInterestRates();
		return (principal*duration*rate)/100;
	}
}
