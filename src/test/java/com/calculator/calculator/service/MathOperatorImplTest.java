package com.calculator.calculator.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathOperatorImplTest {

  private MathOperator mathOperator = new MathOperatorImpl();

    @Test
    public void testMultiplicationOperation() throws InvalidOperationException {
        double operand1 = 20;
        double operand2 = 1;
        String operation = "*";
        double  product= mathOperator.doMath(operand1, operand2, operation);
        assertEquals(20,product);
    }

    @Test
    public void testDivisionOperation() throws InvalidOperationException {
        double operand1 = 4;
        double operand2 = 2;
        String operation = "/";
        double quotient = mathOperator.doMath(operand1, operand2, operation);
        assertEquals(2, quotient );
    }
    @Test
    public void testDivideByZero() {
        double operand1 = 0;
        double operand2 = 0;
        String operation = "/";
        assertThrows(InvalidOperationException.class, () -> {
            mathOperator.doMath(operand1, operand2, operation);
        });
    }

    @Test
    public void testSubtractionOperation() throws InvalidOperationException {
        double operand1 = 2;
        double operand2 = 1;
        String operation = "-";
        double difference = mathOperator.doMath(operand1, operand2, operation);
        assertEquals(1, difference);
    }

    @Test
    public void testPowerOperation() throws InvalidOperationException {
        double response = mathOperator.doMath(4, 2, "**");
        assertEquals(16, response);
    }

    @Test
    public void testLogarithmOperation() throws InvalidOperationException {
        MathOperatorImpl mathOperator = new MathOperatorImpl();
        double operand1 = 10;
        double operand2 = 4;
        String operation = "log";
        double expectedResponse = operand1 * Math.log10(operand2);
        double response= mathOperator.doMath(operand1, operand2, operation);
        assertEquals(expectedResponse, response);
    }

    @Test
    public void testNaturalLogarithmOperation() throws InvalidOperationException {
        MathOperator mathOperator = new MathOperatorImpl();
        double operand1 = 10;
        double operand2 = 4;
        String operation = "ln";
        double expectedResponse = operand1 * Math.log(operand2);
        double response = mathOperator.doMath(operand1, operand2, operation);

        assertEquals(expectedResponse,  response);
    }

}
