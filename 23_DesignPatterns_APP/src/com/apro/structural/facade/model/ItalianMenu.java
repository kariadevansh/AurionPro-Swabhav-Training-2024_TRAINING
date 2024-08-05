package com.apro.structural.facade.model;

public class ItalianMenu implements IMenu{

	@Override
	public void displayMenu() {
		System.out.println("Italian Menu");	
		System.out.println("Choose from:\nPastas\nBreads & cheese\nsoups\npizzas\n");
	}

}
