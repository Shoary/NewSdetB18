package org.example;

public class ArrayT5 {

    public static void main(String[] args) {

        // Creating a 2D array representing car brands
        String[][] carBrands = {
                {"Ford", "Chevrolet", "Tesla"},
                {"Volkswagen", "BMW", "Mercedes-Benz"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}
        };

        // Retrieving values using enhanced for loops (for-each loops)
        System.out.println("Using enhanced for loops:");
        for (String[] countryBrands : carBrands) {
            for (String brand : countryBrands) {
                System.out.print(brand+" ");
            }
        }
        System.out.println();
            }
        }


