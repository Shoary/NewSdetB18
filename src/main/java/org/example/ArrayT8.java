package org.example;

public class ArrayT8 {

    public static void main(String[] args) {

            // Create a 2D array representing a grocery list
        String[][] groceryArray = {
                {"Carrot", "Broccoli", "Spinach"},
                {"Apple", "Banana", "Orange"},
                {"Milk", "Cheese", "Yogurt"},
                {"Chocolate", "Cookies", "Ice Cream"}
        };

        // Retrieve values using nested for loops
        System.out.println("Using nested for loops:");
        for (String[] strings : groceryArray) {
            for (String string : strings) {
                System.out.println(string);
            }
        }

        // Retrieve values using for-each loop
        System.out.println("Using for-each loop:");
        for (String[] category : groceryArray ) {
            for (String list : category) {


                System.out.println(list);
            }
        }
    }
}

