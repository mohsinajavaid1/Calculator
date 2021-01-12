package com.example.calculator;

import com.example.multiplication.MultiplicationManager;

public class CalculatorManager {

    public static Integer calculate(Integer num1, Integer num2){
        return MultiplicationManager.multiply(num1,num2);
    }
}

