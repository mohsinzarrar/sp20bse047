package com.lab6.calculator;

public class calculator {
    public calculator() {
}

    static void Sum(int c, int d) {
        System.out.println("sum is: " + (c + d));
    }

    static void Multiply(int c, int d) {
        System.out.println("multiple is: " + c * d);
    }

    static void Divide(int c, int d) {
        System.out.println("divide is: " + c / d);
    }

    static void Modulus(int c, int d) {
        System.out.println("The modulus is: " + c % d);
    }

    static void Sin(double c) {
        System.out.println("SIN: " + Math.sin(c));
    }

    static void Cos(double c) {
        System.out.println("Cos: " + Math.cos(c));
    }

    static void Tan(double c) {
        System.out.println("tan is: " + Math.tan(c));
    }
}


