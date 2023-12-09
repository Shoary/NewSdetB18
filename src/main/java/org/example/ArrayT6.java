package org.example;

public class ArrayT6 {

    public static void main(String[] args) {

        int[][] numbArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };


        System.out.println("Even numbers in the array:");
        for (int[] ints : numbArray) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] % 2 == 0) {
                    System.out.print(ints[j] + " ");
                }
            }
        }
    }
}

