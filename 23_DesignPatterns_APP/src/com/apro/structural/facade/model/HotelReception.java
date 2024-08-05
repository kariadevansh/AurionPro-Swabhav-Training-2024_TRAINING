package com.apro.structural.facade.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel hotel = new IndianHotel();
		IMenu menu = hotel.getMenu();
		menu.displayMenu();
	}
	public void getItalianMenu() {
		IHotel hotel = new ItalianHotel();
		IMenu menu = hotel.getMenu();
		menu.displayMenu();
	}
	public void getChineseMenu() {
		IHotel hotel = new ChineseHotel();
		IMenu menu = hotel.getMenu();
		menu.displayMenu();
	}
}
