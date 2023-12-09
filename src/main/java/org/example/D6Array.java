package org.example;

public class D6Array {


    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120},

        };
// Getting back complete 1d array from 2D array
        int[] row0 = numbers[0];
// Getting back individual number from 2D Array
        int num = numbers[0][0];

        System.out.println(num);

    }

    }