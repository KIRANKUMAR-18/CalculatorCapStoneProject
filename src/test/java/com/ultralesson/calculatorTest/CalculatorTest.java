package com.ultralesson.calculatorTest;

import com.ultralesson.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.addTwoNumbers(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subTwoNumbers(4, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiplyTwoNumbers(2, 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divTwoNumbers(4, 2);
        Assert.assertEquals(2, result);
    }
    @Test
    public void testAddMultipleNumbers() {
        double result = calculator.addMultipleNumbers(new double[]{1,2,3,4});
        Assert.assertEquals(10, result);
    }
    @Test
    public void testSubtractMultipleNumbers() {
        double result = calculator.subMultipleNumbers(new double[]{1,2,3});
        Assert.assertEquals(2, result);
    }
    @Test
    public void testMulMultipleNumbers() {
        double result = calculator.multiplyMultipleNumbers(new double[]{1,2,3,4});
        Assert.assertEquals(24, result);
    }
    @Test
    public void testDivideMultipleNumbers() {
        double result = calculator.divMultipleNumbers(new double[]{1,2});
        Assert.assertEquals(0.5, result);
    }

}

