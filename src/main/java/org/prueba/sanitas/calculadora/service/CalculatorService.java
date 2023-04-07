package org.prueba.sanitas.calculadora.service;

import java.math.BigDecimal;
import java.util.List;

import org.prueba.sanitas.calculadora.pojo.OperationOutput;

public interface CalculatorService {

	OperationOutput add(List<BigDecimal> addendList);

	OperationOutput subtract(List<BigDecimal> addendList, List<BigDecimal> subtrahendList);

}
