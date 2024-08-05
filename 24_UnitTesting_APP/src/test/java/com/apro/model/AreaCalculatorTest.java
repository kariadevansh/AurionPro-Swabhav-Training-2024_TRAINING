package com.apro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	AreaCalculator area ;
	@BeforeEach
	void init() {
		area = new AreaCalculator();
	}
	@AfterEach
	void status() {
		System.out.println("Test completed");
	}
	@Test
	void testCalculateCircleArea() {
//		fail("unimplemented");
		assertEquals(78.5,area.calculateCircleArea(5),"Circle :");
	}
	@Test
	void testCalculateRectangleArea() {
//		fail("unimplemented");
		assertEquals(100,area.calculateRectangleArea(10, 10),"Rectangle :");
	}
	@Test
	void testCalculatetriangleArea() {
//		fail("unimplemented");
		assertEquals(50, area.calculateTrianlgeeArea(10, 10),"Triangle");
	}
}
