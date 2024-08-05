package com.apro.lamdas.model;

@FunctionalInterface
public interface BookConstructor {
	Book create(double price, String name, String author);
}
