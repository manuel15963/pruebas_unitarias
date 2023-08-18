package com.example.demo1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	@Test

	public void testAddition() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}
}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
}
