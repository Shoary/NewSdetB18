package org.example;

public class E8Array {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 36, 56, 80};

        System.out.println(numbers.length);
        System.out.println(numbers[2]);
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println();
        for (int n : numbers) {

            System.out.print(n+" ");
        }
    }
}