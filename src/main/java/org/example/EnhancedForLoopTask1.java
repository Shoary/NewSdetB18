package org.example;

public class EnhancedForLoopTask1 {

    public static void main(String[] args) {

        int[] numbers={101,100,25,30,25,50,30};


        int divisibleBy2Count = 0;
        int divisibleBy5Count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                divisibleBy2Count++;
            }

            if (number % 5 == 0) {
                divisibleBy5Count++;
            }
        }

        System.out.println("Num div by 2: " + divisibleBy2Count);
        System.out.println("Num div by 5: " + divisibleBy5Count);
    }
}


