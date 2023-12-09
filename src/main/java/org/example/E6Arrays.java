package org.example;

public class E6Arrays {

        public static void main(String[] args) {
            int[] numbers = {10, 25, 44, 33, 56};
            int sum = 0;
            for(int i = 0; i < 5; i++) {
                sum = sum+ numbers[i];
            }

            System.out.println("The sum of all numbers in the array is: " + sum);
        }
    }
