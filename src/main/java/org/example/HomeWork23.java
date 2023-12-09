package org.example;

public class HomeWork23 {

    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'c', 'D', 'E'};


        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }

        System.out.println();


        StringBuilder reversedChars = new StringBuilder(new String(charArray)).reverse();
        System.out.println( reversedChars);
    }
}

