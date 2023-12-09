package org.example;

import java.util.Scanner;

public class HomeWork13 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = scanner.nextLine();


            System.out.println("Enter your mobile number (please use xxx-xxx-xxxx format):");
            String mobileNumber = scanner.nextLine();


            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            scanner.close();

            System.out.println("Your name is " + name + ", your age is " + age + ", and your mobile number is " + mobileNumber);
        }
    }

