package com.example.example.example;

import java.io.IOException;

public class ExceptionExample {
    static void validate(int age) {
        if (age < 18)
            System.out.println("invalid");
//            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        validate(19);
        System.out.println("rest of the code...");
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");

    }
}

class M {
    void method() throws IOException {
        throw new IOException("device error");
    }
}
