package com.example.example.example;

import android.provider.Settings;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;


abstract class Demo {
    void show() {
        System.out.println("i am in show method of super class");
    }

    abstract void display();
}

class Sample {

    void run() {
        System.out.println("i am in run method of super class");
    }

}


class AnonymousInner {


    public static void main(String[] args) {


        Demo lDemo = new Demo() {
            @Override
            void display() {
                System.out.println("i am in display method");
            }
        };

        a a1 = new a() {

            @Override
            public void add() {

            }

            @Override
            public void sub() {

            }
        };

        a1.add();
        lDemo.display();

    }
}

interface a {
    void add();

    void sub();
}
