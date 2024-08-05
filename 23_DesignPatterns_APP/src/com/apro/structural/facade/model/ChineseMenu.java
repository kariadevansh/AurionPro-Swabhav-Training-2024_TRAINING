package com.apro.structural.facade.model;

public class ChineseMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("Chinese Menu");
		System.out.println("Choose from:\nNoodles\nRice\nDumplings\n");
	}

}
