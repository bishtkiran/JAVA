package com.practice;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.num1 = 53;
        calculator.num2 = 25;
        calculator.perofrmOperation();
        System.out.println("Result = "+ calculator.result);

    }
}
