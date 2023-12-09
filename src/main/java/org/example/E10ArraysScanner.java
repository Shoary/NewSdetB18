package org.example;

import java.util.Scanner;

public class E10ArraysScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the size of the Array");

        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println(numbers.length);
    }
}
