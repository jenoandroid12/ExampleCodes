package com.example.example.example;

import java.util.Stack;

public class StackExample {
    public static void main(String args[])
    {
        Stack<Integer> STACK = new Stack<Integer>();

        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);

        System.out.println("Initial Stack: " + STACK);


        System.out.println("Popped element: " +
                STACK.pop());
        System.out.println("Popped element: " +
                STACK.pop());

        System.out.println("Stack after pop operation "
                + STACK);
        System.out.println("The element at the top of the"
                + " stack is: " + STACK.peek());

        System.out.println("Is the stack empty? " +
                STACK.empty());

        System.out.println("Does the stack contains 10 ? "
                + STACK.contains(10));
    }
}
