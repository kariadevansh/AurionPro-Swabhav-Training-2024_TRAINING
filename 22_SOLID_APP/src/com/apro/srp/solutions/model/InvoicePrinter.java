package com.apro.srp.solutions.model;

public class InvoicePrinter {
	private  Invoice invoice;
	private TaxCalculator taxCalculator;
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}

	public  void printInvoice() {
		
		System.out.println("id :"+invoice.getId());
		System.out.println("desc :"+invoice.getDescription());
		System.out.println("amount :"+invoice.getAmount());
		System.out.println("tax percent :"+invoice.getTax());
		System.out.println("total :"+(invoice.getAmount()+taxCalculator.calculateTax()));
	}
}
