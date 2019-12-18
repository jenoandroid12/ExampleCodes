package com.example.example.CalculatorAppDemo;

import java.util.Scanner;

import static java.lang.System.in;

public class MainClass {

    public static void main(String[] args) {

        Scanner lScanner = new Scanner(in);
        System.out.println("Enter String Expression\n");
        String expression = lScanner.nextLine();
        String lStringWithoutSpaces = expression.replaceAll("\\s+", "");
        String lValidateString = new CalculateExpression().checkBalancedParentesis(lStringWithoutSpaces);
        if (lValidateString.equals("Valid")) {
            String lResult = new CalculateExpression().findValueInBraces(lStringWithoutSpaces);
            System.out.println("Answer " + lResult);
        } else {
            System.out.println("Invalid Expression");
        }

    }


}