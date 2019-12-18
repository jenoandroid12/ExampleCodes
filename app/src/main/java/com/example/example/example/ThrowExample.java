package com.example.example.example;

class InvalidInputException extends Exception {
    int id;

    public InvalidInputException(int x) {
        id = x;
    }

}

public class ThrowExample {

    void compute(int a) throws InvalidInputException {
        if (a > 10)
            throw new InvalidInputException(a);
        System.out.println("No error in prog. no exception caught");
    }

    public static void main(String args[]) {

        try {
            new ThrowExample().compute(12);
        } catch(InvalidInputException ex1) {
            System.out.println("Invalid Input");
        }
    }
}
