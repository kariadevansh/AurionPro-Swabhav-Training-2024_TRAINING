package com.apro.structural.facade.model;

public class ChineseHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		IMenu menu = new ChineseMenu();
		return menu;
	}

}
