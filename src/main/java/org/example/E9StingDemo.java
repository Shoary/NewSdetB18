package org.example;

public class E9StingDemo {

    public static void main(String[] args) {
        String str = "Today is Saturday";

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(6,8));
        System.out.println(str.substring(9,str.length()));

        String str2="Java is Fun";
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5,7));
        System.out.println(str2.substring(8,str2.length()));


    }
}
