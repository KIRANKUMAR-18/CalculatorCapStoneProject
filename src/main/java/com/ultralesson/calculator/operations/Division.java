package com.ultralesson.calculator.operations;

import com.ultralesson.calculator.Calculation;

public class Division implements Operation {
    @Override
    public Calculation calculate(double a, double b) {
        Calculation calculation = new Calculation("Division",a/b);
        return calculation;

    }
    public int divide(int a, int b) {

        return a/b;
    }
    public double divideMultipleNumbers(double[] numbers) {
        double values = 0;
        for (int i = 0; i < numbers.length; i++) {
            values += values / numbers[i];


        }

        return values;
    }
}