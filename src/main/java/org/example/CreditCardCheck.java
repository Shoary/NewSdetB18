package org.example;
import java.util.Scanner;

public class CreditCardCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Do you have a credit card? (yes/no): ");

        String hasCreditCard = scanner.nextLine().toLowerCase();

        if (hasCreditCard.equals("yes")) {

            System.out.print("What is the balance on your credit card?: ");
            double creditCardBalance = scanner.nextDouble();


            if (creditCardBalance > 1000) {
                System.out.println("You should pay off your credit card immediately!");
            } else {
                System.out.println("You can spend more on your credit card.");
            }
        } else if (hasCreditCard.equals("no")) {

            System.out.println("Consider applying for a credit card to enjoy its benefits!");
        } else {

            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

        scanner.close();
    }
}
