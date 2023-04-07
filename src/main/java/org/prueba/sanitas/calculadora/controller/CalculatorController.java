package org.prueba.sanitas.calculadora.controller;

import org.prueba.sanitas.calculadora.pojo.AddOperandSet;
import org.prueba.sanitas.calculadora.pojo.OperationOutput;
import org.prueba.sanitas.calculadora.pojo.SubtractOperandSet;
import org.prueba.sanitas.calculadora.service.CalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sanitas/calculator")
public class CalculatorController {

	private final CalculatorService service;
	
	@PostMapping("/add")
	@ResponseBody
	public OperationOutput add(@RequestBody AddOperandSet operandSet) {
		return service.add(operandSet.getFirstAddend(), operandSet.getSecondAddend());
	}
	
	@PostMapping("/subtract")
	@ResponseBody
	public OperationOutput subtract(@RequestBody SubtractOperandSet operandSet) {
		return service.subtract(operandSet.getMinuhend(), operandSet.getSubtrahend());
	}
	
}
