package org.example;

public class HomeWork26 {

    public static void main(String[] args) {
        String original= "Sunday";

        // Check if the String is not empty
        if (!original.isEmpty()) {
            // Print the String in reverse order
            System.out.print("Original : " + original + "\nReversed : ");

            for (int i = original.length() - 1; i >= 0; i--) {
                System.out.print(original.charAt(i));
            }
// Move to the next line for formatting
            System.out.println();
        } else {
            System.out.println("The String is empty.");
        }
    }
}

