package com.example.example.ArrayMatrix;


public class ClassAndObject {
    static int i;
    public static void main(String[] args){
        Parent parent = new Parent();
        parent.a = 10;

        int ans = parent.add();
        System.out.println(Parent.c=20);

        String s = "CalculateString";
        String s1 = "CalculateString";
        s.concat("Jeno");
        System.out.println(s);

        StringBuffer stringBuffer = new StringBuffer("Heo");

        stringBuffer.append(" String Buffer");

        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("CalculateString");

        s2.append(" String Builder");

        System.out.println(s2);

    }
}



