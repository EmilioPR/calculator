package org.prueba.sanitas.calculadora.pojo;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class SubtractOperand {

	private List<BigDecimal> addendList;
	
	private List<BigDecimal> subtrahendList;
	
}
