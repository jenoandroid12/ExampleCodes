package com.example.example.example;

import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class CalculatorSample {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }


    public int division(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println("Divisor can't divide by zero");
        }
        return c;

    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(in);
            CalculatorSample calculatorSample = new CalculatorSample();
            System.out.println("Enter first value\n");
            int lFirstValue = scanner.nextInt();
            System.out.println("Enter second value\n");
            int lSecValue = scanner.nextInt();
            System.out.println(calculatorSample.add(lFirstValue, lSecValue));
            System.out.println(calculatorSample.subtraction(lFirstValue, lSecValue));
            System.out.println(calculatorSample.division(lFirstValue, lSecValue));
            System.out.println(calculatorSample.multiplication(lFirstValue, lSecValue));

        } catch (InputMismatchException e) {
            System.out.println("Your Input is can't consider as int");
        }


    }
}
