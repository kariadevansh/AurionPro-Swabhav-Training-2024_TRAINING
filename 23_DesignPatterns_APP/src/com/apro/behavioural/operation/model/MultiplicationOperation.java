package com.apro.behavioural.operation.model;

public class MultiplicationOperation implements IOperation{

	@Override
	public int doOperation(int a, int b) {
		return a*b;
	}

}
