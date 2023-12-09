package org.Class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String str= "Its Svera's Birthday today.Its Sunday. Today is Java Class";
        String [] wordArr = str.split(" ");
        System.out.println(wordArr.length);
        System.out.println(wordArr[0].trim());
    }
}