package com.example.example.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;

public class Test {

    public static void main(String[] args) {

//        palindrom();
//        sortArray();
//        removeDuplicate();
//        System.out.println("Factorial of 5 is: " + factorial(5));
        if (!checkVal()){
            System.out.println("Invalid");
        }

    }

    private static void palindrom() {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }

    private static void sortArray() {
        int[] a = {5, 1, 3, 2, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }

    private static void removeDuplicate() {
        int[] a = {5, 4, 3, 2, 1, 9, 9, 4};
        int temp = 0;
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] != a[i + 1]) {
                b[j++] = a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    static int factorial(int n) {
        int result;
        if (n == 1) {
            return 1;
        } else {

            result = n * factorial(n - 1);
            System.out.println("Result "+result);
        }


        return result;
    }

    static Boolean checkVal(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        String original = in.nextLine();

        String[] alphabet = new String[]{"+", "-", "/","*"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);
        for (int i =1;i<original.length();i++){
            String next = String.valueOf(original.charAt(i));
            String previous = String.valueOf(original.charAt(i-1));
            System.out.println(next+" "+previous);
            if (list.contains(next) && list.contains(previous)){
                return false;
            }
        }
        return true;

    }
}