package org.example;

public class WhileLoops2 {

    public static void main(String[] args) {
        int a = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("a is less then 10:" + a);

            while (a < 10) {
                System.out.println("a is less than 10:" + a);
                a++;

            }


        }

    }
}