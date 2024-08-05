package com.apro.structural.adapter.model;

public class HatAdapter implements IItems{
	private Hat hat;

	public HatAdapter(Hat hat) {
		this.hat = hat;
	}
	
	@Override
	public String toString() {
		return "Hat\t\t\t" + getItemName()+"\t$"+getItemPrice();
	}

	@Override
	public String getItemName() {
		return hat.getShortName().concat("-").concat(hat.getLongName());
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice()+hat.getTax();
	}

}
