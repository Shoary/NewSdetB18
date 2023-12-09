package org.example;

public class ArrayT4 {

    public static void main(String[] args) {
        // Creating a 2D array representing a grocery list
        String[][] groceryList = {
                {"Carrot", "Broccoli", "Spinach"},
                {"Apple", "Banana", "Orange"},
                {"Milk", "Cheese", "Yogurt"},
                {"Baklava", "Cookies", "Ice Cream"}
        };

        // Retrieving values using nested for loops
        System.out.println("Using nested for loops:");
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.println(groceryList[i][j]);
            }
        }

            }
        }

