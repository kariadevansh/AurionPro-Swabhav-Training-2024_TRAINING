package com.apro.structural.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.apro.structural.adapter.model.Biscuits;
import com.apro.structural.adapter.model.Hat;
import com.apro.structural.adapter.model.HatAdapter;
import com.apro.structural.adapter.model.IItems;
import com.apro.structural.adapter.model.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		List<IItems> shoppingList = new ArrayList<>();
		Biscuits biscuit1 = new Biscuits("oreo",30);
		Biscuits biscuit2 = new Biscuits("jimjam",20);
		
		Hat hat = new Hat("NY","Rangers",100,12);
		HatAdapter hat1 = new HatAdapter(hat);
		
		Hat newHat = new Hat("LA","Dodgers",90,10.5);
		HatAdapter hat2 = new HatAdapter(newHat);
		
		ShoppingCart cart = new ShoppingCart(shoppingList);
		
		cart.addItemToCart(biscuit1);
		cart.addItemToCart(hat1);
		cart.addItemToCart(biscuit2);
		printCart(cart);
		
		cart.addItemToCart(hat2);
		printCart(cart);
	}
	
	
	private static void printCart(ShoppingCart cart) {
		System.out.println("\nDescription\t\tName\t\tPrice");
		cart.getCartItems().stream().forEach((item)->System.out.println(item));
		System.out.println("Cart total\t\t\t\t$"+cart.getCartPrice());
	}
}
