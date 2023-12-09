package org.example;

public class HomeWork3 {


    public static void main(String[] args) {
        // Declare and set the age

        int age = 15;

        // Calculate the fare based on the age
        int fare;

        if (age < 13) {
            fare = 2;
        } else {
            fare = 5;
        }

        // Print out the fare
        System.out.println("The fare for a person with age " + age + " is $" + fare);

}

}
