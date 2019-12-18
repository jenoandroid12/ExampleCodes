package com.example.example.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CalculateString {
    ArrayList<Character> operators;

    CalculateString() {
        operators = new ArrayList<>();
        operators.add('/');
        operators.add('*');
        operators.add('+');
        operators.add('-');
    }


    private String findPostfix(String inputP) {
        String temp = "";
        Stack<Character> al = new Stack<>();
        al.add('(');

        char ch;
        inputP = inputP + ")";
        System.out.println("Input String " + inputP);
        for (int i = 0; i < inputP.length(); i++) {
            ch = inputP.charAt(i);
            System.out.println("ch in for loop " + ch);
            if (ch == '(') {
                al.add('(');
                System.out.println("Loop In al " + al);
            } else if (operators.contains(ch)) {
                al.add(ch);

            } else if (ch == ')') {
                temp = temp + pop(al);
                System.out.println("Loop In temp pop " + temp);
            } else {
                System.out.println("ch befor while " + ch + " op " + operators);
                while (ch != '(' && ch != ')' && !operators.contains(ch)) {
                    temp = temp + ch;
                    i = i + 1;
                    ch = inputP.charAt(i);
                }
                temp = temp + " ";
                i = i - 1;
            }

        }
        return temp;
    }


   /* private String pop(Stack<Character> al, char ch) {
        String temp = "";
        for (int i = al.size() - 1; al.get(i) != '(' && i >= 0; i--) {
            System.out.println("1  " + al.get(i));
            System.out.println("2  " + operators.indexOf(al.get(i)));
            System.out.println("3  " + operators.indexOf(ch));

            if (operators.indexOf(al.get(i)) < operators.indexOf(ch)) {
                temp = temp + al.get(i);
                al.remove(i);
            }
        }
        return temp;
    }

    */


    private String pop(Stack<Character> al) {
        String temp = "";
        for (int i = al.size() - 1; al.get(i) != '(' && i >= 0; i--) {
            temp = temp + al.get(i);
            al.remove(i);
        }
        al.remove(al.size() - 1);
        return temp;
    }


    private float evaluatePostfix(String inputP) {
        Stack<Float> stack = new Stack<>();
        char ch;
        float inputA;
        float inputB;
        for (int i = 0; i < inputP.length(); i++) {
            ch = inputP.charAt(i);
            System.out.println("\nCh in Calculate " + ch);
            if (operators.contains(ch)) {
                inputB = stack.pop();
                inputA = stack.pop();
                System.out.println("\nInput A " + inputA);
                System.out.println("\nInput B " + inputB);
                switch (ch) {

                    case '/':
                        stack.push(inputA / inputB);
                        break;
                    case '*':
                        stack.push(inputA * inputB);
                        break;
                    case '+':
                        stack.push(inputA + inputB);
                        break;
                    case '-':
                        stack.push(inputA - inputB);
                        break;
                }
            } else {
                String temp = "";
                while (!operators.contains(ch) && i < inputP.length() && ch != ' ') {
                    System.out.println("\nCh in while " + ch);
                    temp = temp + ch;
                    i = i + 1;
                    ch = inputP.charAt(i);
                }
                stack.push((Float.parseFloat(temp)));
                System.out.println("\nStack in Calculate " + stack);
            }

        }
        return stack.pop();
    }


    public static void main(String[] args) {
        System.out.println("write the expression to calculate");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        CalculateString obj = new CalculateString();
        String postfix = obj.findPostfix(input);
        System.out.println("postfix " + postfix);
        float result = obj.evaluatePostfix(postfix);

        System.out.println("\n\n result of " + input + " is : " + result);
    }
}
