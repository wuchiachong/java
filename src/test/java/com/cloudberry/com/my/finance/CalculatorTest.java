package com.cloudberry.com.my.finance;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void evaluateExpression() {
		Calculator calculator = new Calculator();
		System.out.println(calculator);
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}

}
