package org.example;
import java.util.Scanner;
public class HomeWork12 {
    public static void main(String[] args) {


            // Create a Scanner object to get input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter their age
            System.out.print("Enter your age: ");

            // Read the user's age as an integer
            int age = scanner.nextInt();

            // Do not close the Scanner for System.in to prevent issues
            // scanner.close();

            // Calculate the age after 10 years
            int futureAge = age + 10;

            // Display the result
            System.out.println("Your age after 10 years is " + futureAge);

            // Close the Scanner if you no longer need it
            scanner.close();
        }

}