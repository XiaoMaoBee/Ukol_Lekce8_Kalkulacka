package com.engeto.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by 0 not allowed");
        }
        return (double)a / b;
    }
    public double squareRoot(int a) {
        if (a < 0) {
            throw new ArithmeticException("Negative value not allowed");
        }
        return Math.sqrt(a);
    }

    public double square(int a) {
        return a * a;
    }

    public double areaOfCircle(int a) {
        if (a < 0) {
            throw new ArithmeticException("Negative value not allowed");
        }
        return (Math.PI * ((a*a)));
    }


}
