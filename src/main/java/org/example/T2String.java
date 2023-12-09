package org.example;

public class T2String {
    public static void main(String[] args) {
        String str = "Java is Fun";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("The letter 'a' appears " + count + " times in the string.");
    }
}