package com.apro.structural.adapter.model;

import java.util.List;

public class ShoppingCart {
	private List<IItems> cartItems;

	public ShoppingCart(List<IItems> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	public  void addItemToCart(IItems item) {
		  cartItems.add(item);
		  System.out.println("Item :"+item.getItemName()+" added to cart");
	}
	
	public List<IItems> getCartItems(){
		return cartItems;
	}
	
	public  double getCartPrice() {
		
		return cartItems.stream()
                .mapToDouble(IItems::getItemPrice) 
                .sum();
	}

}
