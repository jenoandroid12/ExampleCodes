package com.example.example.example;

class Out {

    void outerMethod() {

        System.out.println("inside outerMethod");
        // Inner class is local to outerMethod()
        class Inner {

            Inner(int a){
                System.out.println("inside innerCons");
            }
            void innerMethod() {
                System.out.println("inside innerMethod");
            }
            void innerMethod(int a) {
                System.out.println("inside innerMethod");
            }
        }
        Inner y = new Inner(5);
        y.innerMethod();
        y.innerMethod(4);
    }
}
class MethodInner{
    public static void main(String[] args) {
        Out x = new Out();
        x.outerMethod();

    }
}
