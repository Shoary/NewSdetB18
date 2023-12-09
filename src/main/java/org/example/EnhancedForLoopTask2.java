package org.example;

public class EnhancedForLoopTask2 {
    public static void main(String[] args) {
         int[] numbers={10,15,20,18,9,60,22,30};

        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {

                sumEven += number;
            } else {

                sumOdd += number;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}



