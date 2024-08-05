package com.apro.srp.solutions.test;

import com.apro.srp.solutions.model.Invoice;
import com.apro.srp.solutions.model.InvoicePrinter;
import com.apro.srp.solutions.model.TaxCalculator;
// Create and Move this in ISP packages along with all codes

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("101","maal",5000,12);
		TaxCalculator taxer = new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice,taxer);
		invoicePrinter.printInvoice();
		
		
	}

}
