package com.ultralesson.calculator.operations;


import com.ultralesson.calculator.Calculation;

public class Subtraction implements Operation {
    @Override
    public Calculation calculate(double a, double b) {
        Calculation calculation = new Calculation("Substraction",a-b);
        return calculation;
    }
    public int subtract(int a, int b) {

        return a-b;
    }
    public double subtractMultipleNumbers(double[] numbers) {
        double values = 0;
        for (int i = 0; i < numbers.length; i++) {
            values =numbers[i]-values ;



        }

        return values;
    }
}
