package org.prueba.sanitas.calculadora.pojo;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OperationOutput {

	private String name;
	
	private BigDecimal value;
	
}
