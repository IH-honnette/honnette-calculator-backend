package com.calculator.calculator.service;

import com.calculator.calculator.utils.InvalidOperationException;

public interface MathOperator {
public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
