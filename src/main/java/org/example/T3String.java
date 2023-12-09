package org.example;

public class T3String {

    public static void main(String[] args) {
            String str = "hello";

            // Check if the String is not empty
            if (!str.isEmpty()) {
                // Check if the String has an odd number of characters and has 3 or more characters
                if (str.length() % 2 != 0 && str.length() >= 3) {
                    int middleIndex = str.length() / 2;
                    char middleCharacter = str.charAt(middleIndex);
                    System.out.println("Middle character(s): " + middleCharacter);
                } else {
                    System.out.println("The String does not meet the criteria for printing middle characters.");
                }
            } else {
                System.out.println("The String is empty.");
            }
        }
    }