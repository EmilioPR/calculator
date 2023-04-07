package org.prueba.sanitas.calculadora.service;

import java.math.BigDecimal;

import org.prueba.sanitas.calculadora.pojo.OperationOutput;

public interface CalculatorService {

	OperationOutput add(BigDecimal firstAddend, BigDecimal secondAddend);

	OperationOutput subtract(BigDecimal minuhend, BigDecimal subtrahend);

}
