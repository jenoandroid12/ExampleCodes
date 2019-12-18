package com.example.example.CalculatorAppDemo;

import java.util.EmptyStackException;
import java.util.Stack;

public class CalculateExpression {

    public String findValueInBraces(String pExpression) {


        while (pExpression.contains("((") && pExpression.contains("))")) {

            int lFirstIndex = pExpression.indexOf("((");

            int lLastIndex = pExpression.indexOf("))");

            String lStartFirstBrace = pExpression.substring(lFirstIndex, lFirstIndex + 1);
            String lEndFirstBrace = pExpression.substring(lFirstIndex + 1, lFirstIndex + 2);

            String lStartLastBrace = pExpression.substring(lLastIndex, lLastIndex + 1);
            String lEndLastBrace = pExpression.substring(lLastIndex + 1, lLastIndex + 2);

            if (lStartFirstBrace.equals(lEndFirstBrace) && lStartLastBrace.equals(lEndLastBrace)) {
                pExpression = pExpression.substring(lFirstIndex + 1, lLastIndex + 1);
            }
        }


        while (pExpression.contains("(") && pExpression.contains(")")) {

            int fIndex = pExpression.indexOf("(");
            int nIndex = pExpression.indexOf(")");
            String subString = pExpression.substring(fIndex + 1, nIndex);
            pExpression = pExpression.substring(0, fIndex)
                    + evaluate(subString)
                    + pExpression.substring(nIndex + 1,
                    pExpression.length());
        }

        return evaluate(pExpression);

    }

    public String evaluate(String pExpression) {
        Stack<String> lOperatorStack = new Stack<>();
        Stack<Integer> lOperandStack = new Stack<>();

        pExpression = pExpression.replaceAll("-", "+-");
        String lTemp = "";

        for (int i = 0; i < pExpression.length(); i++) {
            char ch = pExpression.charAt(i);
            if (ch == '-') {
                lTemp = "-" + lTemp;


            } else if (ch != '+' && ch != '*' && ch != '/') {
                lTemp = lTemp + ch;

            } else {
                lOperandStack.push(Integer.parseInt(lTemp));
                lOperatorStack.push(String.valueOf(Integer.valueOf(ch)));

                lTemp = "";

            }
        }
        lOperandStack.push(Integer.parseInt(lTemp));
//        System.out.println("Full lOperandStack stack " + lOperandStack.toString());

        calculate(lOperatorStack, lOperandStack);

        return String.valueOf(lOperandStack.pop());
    }

    private void calculate(Stack<String> pOperatorStack, Stack<Integer> pOperandStack) {
        Stack<Integer> lOperatorTempStack = new Stack<Integer>();
        Stack<Integer> lValuesTempStack = new Stack<Integer>();
        char lOperatorsArray[] = {'/', '*', '+'};

        for (int i = 0; i < lOperatorsArray.length; i++) {
            boolean it = false;
            while (!pOperatorStack.isEmpty()) {
                int lCalOperator = Integer.parseInt(pOperatorStack.pop());
                int lValue1 = pOperandStack.pop();
                int lValue2 = pOperandStack.pop();

                if (lCalOperator == lOperatorsArray[i]) {
                    if (i == 0) {
                        lValuesTempStack.push(lValue2 / lValue1);
                        it = true;

                        break;
                    } else if (i == 1) {
                        lValuesTempStack.push(lValue2 * lValue1);

                        it = true;
                        break;
                    } else if (i == 2) {
                        lValuesTempStack.push(lValue2 + lValue1);

                        it = true;
                        break;
                    }
                } else {
                    lValuesTempStack.push(lValue1);
                    pOperandStack.push(lValue2);
                    lOperatorTempStack.push(lCalOperator);
                }
            }

            while (!lValuesTempStack.isEmpty())
                pOperandStack.push(lValuesTempStack.pop());
            while (!lOperatorTempStack.isEmpty())
                pOperatorStack.push(String.valueOf(lOperatorTempStack.pop()));

            if (it)
                i--;
        }

    }

    public String checkBalancedParentesis(String pExpression) {

        if (pExpression.isEmpty())
            return "Valid";

        Stack<Character> lStack = new Stack<Character>();
        for (int i = 0; i < pExpression.length(); i++) {
            char current = pExpression.charAt(i);
            if (current == '(') {
                lStack.push(current);
            }
            if (current == ')') {
                char last = lStack.peek();
                if (current == ')' && last == '(') {
                    lStack.pop();
                }
            }
        }
        return lStack.isEmpty() ? "Valid" : "Not Valid";
    }

}
