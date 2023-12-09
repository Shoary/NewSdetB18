package org.example;

public class E1Continue {

    public static void main(String[] args) {

        int[] numbers = {10, 45, 12, 47, 20, 30};

        for (int number : numbers) {
            if (number % 2 != 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}


