package com.apro.structural.facade.model;

public class IndianMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("Indian Menu");
		System.out.println("choose from:\nIndian snacks\nTandoor starters\nIndianBreads\nSabzis\nTandoor breads\n");
	}

}
