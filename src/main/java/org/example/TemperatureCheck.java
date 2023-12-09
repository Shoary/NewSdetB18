package org.example;

public class TemperatureCheck {

        public static void main(String[] args) {
            // Create a variable to store temperature
            double temperature = 40; // You can change this value to test different temperatures

            // Check if the temperature is below 32
            if (temperature < 32.0) {
                System.out.println("Water will freeze with temperature " + temperature + ".");
            } else {
                System.out.println("Water will not freeze with temperature " + temperature + ".");
            }
        }
    }


