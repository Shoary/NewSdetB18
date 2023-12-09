package org.example;

import java.util.Scanner;

public class E1ScannerAndArray {

        public static void main(String[] args) {

            int[] numbers = new int[5];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Please enter a number " + (i + 1));
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Here are all the numbers that you entered:");

            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }

