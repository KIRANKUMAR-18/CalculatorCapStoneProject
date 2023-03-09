package com.ultralesson.calculator;

public class Calculation {
    private String input;
    private double result;

    public Calculation(String input, double result) {
        this.input = input;
        this.result = result;
    }

    public String getInput() {
        return input;
    }

    public double getResult() {
        return result;
    }
}
