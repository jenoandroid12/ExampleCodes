package com.example.example.example;

import android.provider.Settings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;

public class HelloSample {

    public static int calculate(String s) {
        // delte white spaces
        s = s.replaceAll(" ", "");

        Stack<String> stack = new Stack<String>();
        char[] arr = s.toCharArray();

        for (char e : arr) {
            System.out.println("Char  Arr " + e);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ')
                continue;

            if (arr[i] >= '0' && arr[i] <= '9') {
                sb.append(arr[i]);
                System.out.println("String Builder Append in loop " + sb);
                if (i == arr.length - 1) {
                    stack.push(sb.toString());
                    System.out.println("Stack Push in loop " + stack);
                }
            } else {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                    System.out.println("Stack Push2 in loop " + stack);
                }

                if (arr[i] != ')') {
                    stack.push(new String(new char[]{arr[i]}));
                } else {
                    // when meet ')', pop and calculate
                    ArrayList<String> t = new ArrayList<String>();
                    while (!stack.isEmpty()) {
                        String top = stack.pop();
                        if (top.equals("(")) {
                            break;
                        } else {
                            t.add(0, top);
                        }
                    }

                    int temp = 0;
                    String oprt;
                    int v1;
                    int v2;
                    if (t.size() == 1) {
                        temp = Integer.valueOf(t.get(0));
                    } else {
                        for (int j = t.size() - 1; j > 0; j = j - 2) {
//                            oprt = t.get(j - 1);
//                            v1 = Integer.valueOf(t.get(j - 2));
//                            v2 = Integer.valueOf(t.get(j));
//
//                            if (oprt.equals("+")) {
//                                temp = v1 + v2;
//                                System.out.println("dfdfsdfsdf   " + temp);
//                            } else if (oprt.equals("-")) {
//                                temp = v1 - v2;
//                                System.out.println("dfdfsdfsdf   " + temp);
//                            } else if (oprt.equals("*")) {
//                                temp = v1 * v2;
//                                System.out.println("dfdfsdfsdf   " + temp);
//                            } else if (oprt.equals("/")) {
//                                temp = v1 / v2;
//                                System.out.println("dfdfsdfsdf   " + temp);
//                            }


                            if (t.get(j - 1).equals("-")) {
                                temp += 0 - Integer.valueOf(t.get(j));
                            } else if (t.get(j - 1).equals("/")) {
                                temp += 0 / Integer.valueOf(t.get(j));
                            } else {
                                temp += Integer.valueOf(t.get(j));
                            }
                            System.out.println("List loop t.get(j) " + t.get(j));
                            System.out.println("List loop t.get(j-1) " + t.get(j - 1));
                            System.out.println("List loop t.get(j-2) " + t.get(j - 2));
                        }
                        temp += Integer.valueOf(t.get(0));
                    }
                    stack.push(String.valueOf(temp));
                    System.out.println("ArrayList in loop " + t);
                }
            }
        }

        System.out.println("String " + stack);

        ArrayList<String> t = new ArrayList<String>();
        while (!stack.isEmpty()) {
            String elem = stack.pop();
            System.out.println("elem " + elem);
            t.add(0, elem);
            System.out.println("t.add " + t);
        }


        int temp = 0;
        String oprt;
        int v1;
        int v2;

        for (int i = t.size() - 1; i > 0; i = i - 2) {

            if (t.get(i - 1).equals("-")) {
//                System.out.println("t.get(i - 1)     "+t.get(i - 1));
                temp += 0 - Integer.valueOf(t.get(i));
                System.out.println("temp +=t.get(i - 1)    " + temp);
            } else {
//                System.out.println("t.get(i)  "+t.get(i));
                temp += Integer.valueOf(t.get(i));
                System.out.println("temp +=t.get(i)    " + temp);
            }

//            oprt = t.get(i - 1);
//            v1 = Integer.valueOf(t.get(i - 2));
//            v2 = Integer.valueOf(t.get(i));
//
//            if (oprt.equals("+")) {
//                temp = v1 + v2;
//                System.out.println("zzzaazazaza   " + temp);
//            } else if (oprt.equals("-")) {
//                temp = v1 - v2;
//                System.out.println("zazazazaaza   " + temp);
//            } else if (oprt.equals("*")) {
//                temp = v1 * v2;
//                System.out.println("zazazazazaa   " + temp);
//            } else if (oprt.equals("/")) {
//                temp = v1 / v2;
//
//
//            }
        }

        System.out.println("Before temp  " + temp);
        temp += Integer.valueOf(t.get(0));
        System.out.println("Final temp  " + temp);

        return temp;
    }

    // Driver method to test above methods
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(in);
        String exp = scanner.nextLine();
        System.out.println(HelloSample.calculate(exp));

    }


}
