package org.example;

public class E2EnhancedForLoop {

    public static void main(String[] args) {
        char[] word = {'s', 'u', 'n', 'd', 'a', 'y'};


        System.out.println();

        System.out.print("Reversed word: ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }
}