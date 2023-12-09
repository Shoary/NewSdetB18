package org.Class12;

public class T3 {
    public static void main(String[] args) {
        String str= "It is Saturday? Is it raining?Do we have a Java Class today?";

        String [] strArr = str.split("[ ]");

        System.out.println(strArr.length);
        System.out.println(strArr[0].trim());

    }
}
