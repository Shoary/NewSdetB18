package org.example;

public class HomeWork4 {


        public static void main(String[] args) {
            // Declare and set the traffic light color
            String trafficLight = "Green"; // I can change this value to test different scenarios

            // Check the traffic light color and print the corresponding action

            if (trafficLight.equals("Red")) {

                System.out.println("Stop");

            } else if (trafficLight.equals("Yellow")) {

                System.out.println("Caution");

            } else if (trafficLight.equals("Green")) {

                System.out.println("Go");
            } else {
                System.out.println("Invalid traffic light color");
            }
        }
    }


