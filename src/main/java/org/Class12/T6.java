package org.Class12;

public class T6 {

    public static void main(String[] args) {

        String str = "car";
        String reversedWord = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + str.charAt(i);

        }
        if (str.equalsIgnoreCase(reversedWord)) {
            System.out.println("Its a Palindrome");
        } else {

            System.out.println("Its not a Palindrome");

        }

    }
}