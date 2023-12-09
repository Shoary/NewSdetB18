package org.example;

public class Recap {

    public static void main(String[] args) {
// casting : widening/implicit & narrowing /explicit
 //  byte->short->int->long->double
        double price=12;

        System.out.println(price);

        // narrowing: double->float->long->int->short->byte

        int num=(int)12.9;
        System.out.println(num);

        double result=12/7;

        System.out.println(result);
    }
}
