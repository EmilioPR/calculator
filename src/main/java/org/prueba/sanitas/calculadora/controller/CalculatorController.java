package org.prueba.sanitas.calculadora.controller;

import org.prueba.sanitas.calculadora.pojo.AddOperandSet;
import org.prueba.sanitas.calculadora.pojo.OperationOutput;
import org.prueba.sanitas.calculadora.pojo.SubtractOperandSet;
import org.prueba.sanitas.calculadora.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sanitas/calculator")
public class CalculatorController {

	private final CalculatorService service;

	@PostMapping("/add")
	@ResponseBody
	public OperationOutput add(@RequestBody AddOperandSet operandSet) {
		try {
			return service.add(operandSet.getFirstAddend(), operandSet.getSecondAddend());
		} catch (ArithmeticException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
		}
	}

	@PostMapping("/subtract")
	@ResponseBody
	public OperationOutput subtract(@RequestBody SubtractOperandSet operandSet) {
		try {
			return service.subtract(operandSet.getMinuhend(), operandSet.getSubtrahend());
		} catch (ArithmeticException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
		}
	}

}
