package com.calculator.calculator.controller;

import com.calculator.calculator.dto.DoMathRequestDto;
import com.calculator.calculator.service.MathOperatorImpl;
import com.calculator.calculator.utils.InvalidOperationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/JSON", produces="application/json")
public class MathController{

	@Autowired
	private MathOperatorImpl mathOperator = new MathOperatorImpl();

	@PostMapping("/calculate")
	public double doMath(@RequestBody DoMathRequestDto dto) throws InvalidOperationException {
		double res = mathOperator.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation());
		return res;
	}
}
