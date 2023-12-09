package org.example;

public class HomeWork25 {

    public static void main(String[] args) {

        char[] values = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

        // Rearrange the characters to get the desired output "syntax"
        char[] rearrangedValues = {values[0], values[2], values[4], values[6], values[1], values[10]};

        for (char value : rearrangedValues) {
            System.out.print(value);
        }
    }

}