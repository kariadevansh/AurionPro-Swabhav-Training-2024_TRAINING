package com.apro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	@BeforeEach
	void init() {
		operation = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Executed");
	}
	
	
	@Test
	void testAddition() {
		assertEquals(10,operation.addition(5, 5),"Addition");
	}

	@Test
	void testSubstraction() {
		assertEquals(0,operation.substraction(5, 5),"substract");
	}

	@Test
	void testMultiplication() {
		assertEquals(25,operation.multiplication(5, 5),"multiply");
	}

	@Test
	void testDivision() {
		assertEquals(1,operation.division(5, 5),"divide");
	}

}
