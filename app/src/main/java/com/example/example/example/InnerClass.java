package com.example.example.example;

class Outer {
    private int a;

    public void show() {
        a = 10;
        System.out.println("In a outer show method");
    }

    // Simple nested inner class
    class Inner {

        int balance = 10;

        public void show() {
            a = 20;
            System.out.println("In a nested show method");
        }

        void get(){
            System.out.println("In a nested get method");
        }

        class NestedInner{
            void set(){
                a = 30;
                System.out.println("In a nested set method "+a);

            }
        }
    }

    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
        Outer.Inner.NestedInner nestedInner = new Outer().new Inner().new NestedInner();
        nestedInner.set();
    }

}
