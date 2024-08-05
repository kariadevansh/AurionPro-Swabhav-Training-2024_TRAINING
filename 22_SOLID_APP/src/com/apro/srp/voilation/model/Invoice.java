package com.apro.srp.voilation.model;

public class Invoice {
	private static  String id;
	private  static String description;
	private  static double amount;
	private static  double tax;
	public Invoice(String id, String description, double amount, double tax) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public static String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax= tax;
	}
	
	public static double calculateTax() {
		return (amount*tax/100);
	}
	
	public static void printInvoice() {
		
		System.out.println("id : "+getId()+ "\ndescription : "+getDescription()+"\namount : "+getAmount()+"\nTax : "+calculateTax());
	}
}
