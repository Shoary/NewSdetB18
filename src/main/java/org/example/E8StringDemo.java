package org.example;

public class E8StringDemo {

    public static void main(String[] args) {

        String str = "Today is Saturday";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println("Index of 'a': " + i);
            }
        }
    }
}

