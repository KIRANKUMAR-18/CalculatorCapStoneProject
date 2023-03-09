package com.ultralesson.calculatorTest;

import com.ultralesson.calculator.Calculator;
import org.testng.annotations.Test;

public class CalculatorExceptionTest {
    private Calculator calculator = new Calculator();

    @Test(expectedExceptions = ArithmeticException.class)
    public void divideByZeroTest() {
        calculator.divTwoNumbers(10, 0);
    }

}
