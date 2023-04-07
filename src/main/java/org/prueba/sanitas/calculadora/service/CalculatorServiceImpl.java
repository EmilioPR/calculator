package org.prueba.sanitas.calculadora.service;

import java.math.BigDecimal;
import java.util.List;

import org.prueba.sanitas.calculadora.pojo.OperationOutput;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public OperationOutput add(List<BigDecimal> addendList) {
		BigDecimal result = new BigDecimal(0);
		
		for (BigDecimal addend : addendList) {
			result = result.add(addend);
		}
		
		return OperationOutput.builder().value(result).build();
	}

	@Override
	public OperationOutput subtract(List<BigDecimal> addendList, List<BigDecimal> subtrahendList) {
		BigDecimal result = new BigDecimal(0);
		
		for (BigDecimal addend : addendList) {
			result = result.add(addend);
		}
		
		for (BigDecimal subtrahend : subtrahendList) {
			result = result.subtract(subtrahend);
		}
		
		return OperationOutput.builder().value(result).build();
	}

}
