package com.example.example.example;




public class EnumExample {

    enum Color {
        RED, GREEN, ORANGE, BLUE;
    }
    // Driver method
    public static void main(String[] args) {
        Color color = Color.RED;

        switch (color)
        {
            case RED:
                System.out.println("Color is red.");
                break;
            case GREEN:
                System.out.println("Color is green.");
                break;
            case ORANGE:
            case BLUE:
                System.out.println("Color is blue.");
                break;
            default:
                System.out.println("There is no color.");
                break;
        }

        for (Color r : Color.values()){
            System.out.println(r);
        }
    }
}
