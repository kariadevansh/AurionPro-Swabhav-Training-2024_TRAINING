package com.apro.structural.proxy.model;

public class ProxyDocument implements IDocument {
 private RealDocument realDocument;
 private String userRole;

 public ProxyDocument(String userRole, String content) {
     this.userRole = userRole;
     this.realDocument = new RealDocument(content);
 }

 @Override
 public void view() {
     if (hasPermission()) {
         realDocument.view();
     } else {
         System.out.println("Access denied: insufficient permissions.");
     }
 }

 private boolean hasPermission() {
     return "admin".equals(userRole);
 }
}
