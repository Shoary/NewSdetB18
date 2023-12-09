package org.example;


import java.util.Scanner;

public class HomeWork6 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print(" Please Enter a number: ");
        number = scanner.nextInt();


        if (number >= 1 && number <= 10) {
            System.out.println("The number is small.");
        } else

        if (number >= 11 && number <= 100) {
            System.out.println("The number is medium.");
        } else

        if (number >= 101 && number <= 1000) {
            System.out.println("The number is large.");
        } else {
            System.out.println("The number is out of range.");
        }
    }
}

