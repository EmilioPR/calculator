package org.prueba.sanitas.calculadora.controller;

import org.prueba.sanitas.calculadora.pojo.AddOperand;
import org.prueba.sanitas.calculadora.pojo.OperationOutput;
import org.prueba.sanitas.calculadora.pojo.SubtractOperand;
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
	public OperationOutput add(@RequestBody AddOperand operand) {
		return service.add(operand.getAddendList());
	}
	
	@PostMapping("/subtract")
	@ResponseBody
	public OperationOutput subtract(@RequestBody SubtractOperand operand) {
		return service.subtract(operand.getAddendList(), operand.getSubtrahendList());
	}
	
}
