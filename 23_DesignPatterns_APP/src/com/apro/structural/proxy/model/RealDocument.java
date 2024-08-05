package com.apro.structural.proxy.model;

public class RealDocument implements IDocument {
 private String content;

 public RealDocument(String content) {
     this.content = content;
 }

 @Override
 public void view() {
     System.out.println("Viewing document content: " + content);
 }
}

