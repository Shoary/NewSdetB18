package org.example;

public class Variables2 {

    public static void main(String[] args) {
        // Define variables to store student's information
        String firstName = "Anas";
        String lastName = "ShoAry";
        String city = "McKinney";
        String state = "TX";
        String phoneNumber = "682-702-3308";


        System.out.println("My name is " + firstName + " and my last name is " + lastName);
        System.out.println("I live in " + city + " and state " + state);
        System.out.println("And my phone number is " + phoneNumber);


        city = "Los Angeles";
        state = "CA";
        phoneNumber = "682-702-0330";


        System.out.println("\nAfter moving:");
        System.out.println("My name is " + firstName + " and my last name is " + lastName);
        System.out.println("I moved to new city " + city + " and new state " + state);
        System.out.println("My new phone number is " + phoneNumber);


    }
}
