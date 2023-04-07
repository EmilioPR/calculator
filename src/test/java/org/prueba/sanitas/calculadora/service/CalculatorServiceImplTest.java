package org.prueba.sanitas.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prueba.sanitas.calculadora.pojo.OperationOutput;

class CalculatorServiceImplTest {

	private CalculatorServiceImpl underTest;

	@BeforeEach
	void beforeEach() {
		underTest = new CalculatorServiceImpl();
	}

	@Test
	void shouldAddNumberList() {
		BigDecimal zero = new BigDecimal(0);
		List<BigDecimal> data = List.of(new BigDecimal(0));
		OperationOutput output = underTest.add(data);
		assertEquals("ADD", output.getName());
		assertEquals(zero, output.getValue());

		data = List.of(new BigDecimal(0), new BigDecimal(1), new BigDecimal(-1));
		output = underTest.add(data);
		assertEquals("ADD", output.getName());
		assertEquals(zero, output.getValue());
	}

	@Test
	void shouldSubtractNumberList() {
		BigDecimal zero = new BigDecimal(0);
		List<BigDecimal> minuhend = List.of(new BigDecimal(0));
		List<BigDecimal> subtrahend = List.of(new BigDecimal(0));
		OperationOutput output = underTest.subtract(minuhend, subtrahend);
		assertEquals("SUBTRACT", output.getName());
		assertEquals(zero, output.getValue());
		
		minuhend = List.of(new BigDecimal(1), new BigDecimal(2));
		subtrahend = List.of(new BigDecimal(1), new BigDecimal(2));
		output = underTest.subtract(minuhend, subtrahend);
		assertEquals("SUBTRACT", output.getName());
		assertEquals(zero, output.getValue());
	}
}
