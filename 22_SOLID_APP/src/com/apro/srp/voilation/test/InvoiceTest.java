package com.apro.srp.voilation.test;

import com.apro.srp.voilation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1 = new Invoice("101","maal",5000,12);
		
		
		i1.printInvoice();
	}

}
