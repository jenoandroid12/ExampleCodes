package com.example.example.example;

import java.util.Scanner;
import java.util.Set;

import javax.xml.transform.sax.TemplatesHandler;

import static java.lang.System.in;

class RunnableExample implements Runnable {
    public void run() {
        for (int i = 1; i < 50; i++) {
            //Sleep
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);

        }
    }


    //    public static void main(String args[]) {
//        RunnableExample m1 = new RunnableExample();
//        RunnableExample m2 = new RunnableExample();
//        RunnableExample m3 = new RunnableExample();
//        Thread t1 = new Thread(m1);
//        Thread t2 = new Thread(m1);
//        Thread t3 = new Thread(m1);
//        t1.start();
//
////        m1.run();
////        m2.run();
////        m3.run();
//
////        try {
////            t1.join();
////        } catch (Exception e) {
////            System.out.println(e);
////        }
//        t2.start();
//        t3.start();
//
//    }
    public static void main(String[] args) {
        Runnable lRunnable1 = new A();
        lRunnable1.run();

        Runnable lRunnable2 = new B();
        lRunnable2.run();

        Runnable lRunnable3 = new C();
        lRunnable3.run();
    }

}

class A extends Thread {

    PrintVal lRunnable1 = new PrintVal();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread A " + i);
            lRunnable1.printValue("Thread A " + i);
        }

    }
}

class B extends Thread {
    PrintVal lRunnable2 = new PrintVal();

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread B " + i);
            lRunnable2.printValue("Thread B " + i);
        }
    }
}

class C extends Thread {
    PrintVal lRunnable3 = new PrintVal();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread C " + i);
            lRunnable3.printValue("Thread C " + i);
        }
    }
}

class PrintVal {
     void printValue(String pStr) {
       synchronized (this) {
        System.out.println(pStr);
       }
    }
}

