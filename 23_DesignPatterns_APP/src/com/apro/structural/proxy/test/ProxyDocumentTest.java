package com.apro.structural.proxy.test;

import com.apro.structural.proxy.model.IDocument;
import com.apro.structural.proxy.model.ProxyDocument;

public class ProxyDocumentTest {
 public static void main(String[] args) {
     IDocument adminDocument = new ProxyDocument("admin", "Confidential Report");
     IDocument userDocument = new ProxyDocument("user", "Confidential Report");

     System.out.println("Admin access:");
     adminDocument.view(); 

     System.out.println("\nUser access:");
     userDocument.view(); 
 }
}
