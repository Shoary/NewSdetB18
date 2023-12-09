package org.example;

public class ArrayT7 {

    public static void main(String[] args) {

            // Create a 2D array of countries
            String[][] countries = {
                    {"USA", "Canada", "Mexico"},
                    {"Brazil", "Argentina", "Colombia"},
                    {"Germany", "France", "Spain", "Italy"},
                    {"China", "India", "Japan", "South Korea"},
                    {"Nigeria", "South Africa", "Kenya"}
            };

            System.out.println("Using nested for loops:");
            for (int i = 0; i < countries.length; i++) {
                for (int j = 0; j < countries[i].length; j++) {
                    System.out.print(countries[i][j]+" ");

                }
            }

            System.out.println("\nUsing for-each loop:");
            for (String[] continentCountries : countries) {
                for (String country : continentCountries) {
                    System.out.print(country +" ");
                }
            }

            int totalCountries = 0;
            for (String[] continentCountries : countries) {
                totalCountries += continentCountries.length;
            }

            System.out.println("\nTotal number of countries: " + totalCountries);
        }
    }
