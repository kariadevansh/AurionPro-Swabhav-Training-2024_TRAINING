package com.apro.lamdas.model;

public class Book {
    private double price;
    private String name;
    private String author;

    public Book(double price, String name, String author) {
        this.price = price;
        this.name = name;
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

