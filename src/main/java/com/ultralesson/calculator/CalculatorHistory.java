package com.ultralesson.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorHistory {
    private List<Calculation> history = new ArrayList<>();

    public void addCalculation(Calculation calculation) {
        history.add(calculation);
    }

    public List<Calculation> getHistory() {
        return history;
    }
}
