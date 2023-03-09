package com.ultralesson.calculator;

import com.ultralesson.calculator.operations.*;


import java.util.List;

public class Calculator {
    private CalculatorHistory calculatorHistory;

    public Calculator() {
        this.calculatorHistory = new CalculatorHistory();
    }
    public int addTwoNumbers(int a, int b){

            return new Addition().add(a, b);


    }
    public double addMultipleNumbers(double[] numbers){

            return new Addition().addMultipleNumbers(numbers);


    }
    public int subTwoNumbers(int a, int b){

            return new Subtraction().subtract(a,b);


    }

    public double subMultipleNumbers(double[] numbers){

            return new Subtraction().subtractMultipleNumbers(numbers);


    }
    public int multiplyTwoNumbers(int a, int b){

            return new Multiplication().multiply(a, b);



    }
    public double multiplyMultipleNumbers(double[] numbers){

            return new Multiplication().multiplyMultipleNumbers(numbers);


    }
    public int divTwoNumbers(int a, int b) {
        try {
            return new Division().divide(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return a;
    }
    public double divMultipleNumbers(double[] numbers){

            return new Addition().addMultipleNumbers(numbers);

    }


    public List<Calculation> getHistory(){
        return calculatorHistory. getHistory();
    }
    public Calculation performOperation(double a, double b, Operation operation) {

        Calculation calculate = operation.calculate(a, b);
        //store in history
        calculatorHistory.addCalculation(calculate);
        return calculate;
    }

    public List<Calculation> getHistory(CalculatorHistory calculatorHistory) {
        return calculatorHistory.getHistory();

    }
}




