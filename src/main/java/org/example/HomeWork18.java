package org.example;

public class HomeWork18 {

    public static void main(String[] args) {
        String[] cars = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes"};

        // Method 1: Using a for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Method 2: Using an enhanced for loop /for each loop

        for (String car : cars) {
            System.out.println(car);
        }
    }

}