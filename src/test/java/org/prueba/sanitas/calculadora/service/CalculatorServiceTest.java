package org.prueba.sanitas.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prueba.sanitas.calculadora.pojo.OperationOutput;

class CalculatorServiceTest {

	private CalculatorService calculatorService;
	
	@BeforeEach
	void beforeEach() {
		calculatorService = new CalculatorServiceImpl();
	}
	
	@Test
	void shouldAddNumbers() {
		final BigDecimal zero = new BigDecimal(0);
		final BigDecimal minusOne = new BigDecimal(-1);
		
		BigDecimal first = new BigDecimal(0);
		BigDecimal second = new BigDecimal(0);
		OperationOutput result = calculatorService.add(first, second);
		assertEquals(zero, result.getValue());
		
		first = new BigDecimal(1);
		second = first.multiply(minusOne);
		result = calculatorService.add(first, second);
		assertEquals(zero, result.getValue());
	}
	
	@Test
	void shouldSubtractNumbers() {
		final BigDecimal zero = new BigDecimal(0);
		
		BigDecimal first = new BigDecimal(0);
		BigDecimal second = new BigDecimal(0);
		OperationOutput result = calculatorService.subtract(first, second);
		assertEquals(zero, result.getValue());
		
		first = new BigDecimal(1);
		second = new BigDecimal(1);
		result = calculatorService.subtract(first, second);
		assertEquals(zero, result.getValue());
	}
}
