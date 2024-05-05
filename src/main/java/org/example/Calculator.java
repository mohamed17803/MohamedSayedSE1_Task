package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int A, int B) {
        return A * B;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(" Cannot Divide By Zero");
        }
        return a / b;
    }


    }


