package org.example;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade (A, B, or C): ");
        String grade = scanner.nextLine().toUpperCase();

        switch (grade) {
            case"A":
                System.out.println("A - Excellent");
                break;
            case"B":
                System.out.println("B - Good");
                break;
            case "C":
                System.out.println("C - Average");
                break;
            case "D":

                System.out.println("D - Bad");
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, or C.");
        }
    }
}


