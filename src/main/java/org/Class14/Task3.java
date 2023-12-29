package org.Class14;

public class Task3 {


        // Method to reverse a string (accessible by class name)
        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }

        // Method to extract vowels from a string (accessible only within the class)
        private static String extractVowels(String input) {
            StringBuilder result = new StringBuilder();
            for (char ch : input.toCharArray()) {
                if (isVowel(ch)) {
                    result.append(ch);
                }
            }
            return result.toString();
        }

        // Helper method to check if a character is a vowel
        private static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);
            return ch == 'e' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }

        // Example main method
        public static void main(String[] args) {
            String original = "Hello, World!";

            // Reversing a string using the class method
            String reversed = Task3.reverseString(original);
            System.out.println( reversed);

            // Extracting vowels using the private method
            String vowels = extractVowels(original);
            System.out.println("Vowels"+" " + vowels);
        }
    }


