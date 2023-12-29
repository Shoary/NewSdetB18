package org.Class21;

public class Vehicle {


        String make;
        String model;
        double fuelLevel;

        public Vehicle(String make, String model, double fuelLevel) {
            this.make = make;
            this.model = model;
            this.fuelLevel = fuelLevel;
        }

        public void startEngine() {
            System.out.println(make + " " + model + " engine started.");
        }

        public void stopEngine() {
            System.out.println(make + " " + model + " engine stopped.");
        }

        public void fuelUp(double amount) {
            fuelLevel += amount;
            System.out.println(make + " " + model + " fueled up. Current fuel level: " + fuelLevel + " liters.");
        }

        public void polyMethod() {
            System.out.println("This is a generic method in " + make + " " + model + ".");
        }
    }

    class Car extends Vehicle {
        int numDoors;

        public Car(String make, String model, double fuelLevel, int numDoors) {
            super(make, model, fuelLevel);
            this.numDoors = numDoors;
        }

        @Override
        public void startEngine() {
            System.out.println(make + " " + model + " car engine started. It has " + numDoors + " doors.");
        }

        @Override
        public void stopEngine() {
            System.out.println(make + " " + model + " car engine stopped.");
        }

        @Override
        public void polyMethod() {
            System.out.println("This is a car-specific method in " + make + " " + model + ".");
        }
    }

    class Truck extends Vehicle {
        double payloadCapacity;

        public Truck(String make, String model, double fuelLevel, double payloadCapacity) {
            super(make, model, fuelLevel);
            this.payloadCapacity = payloadCapacity;
        }

        @Override
        public void startEngine() {
            System.out.println(make + " " + model + " truck engine started. Payload capacity: " + payloadCapacity + " kg.");
        }

        @Override
        public void stopEngine() {
            System.out.println(make + " " + model + " truck engine stopped.");
        }

        @Override
        public void polyMethod() {
            System.out.println("This is a truck-specific method in " + make + " " + model + ".");
        }
    }

    class Motorcycle extends Vehicle {
        int numWheels;

        public Motorcycle(String make, String model, double fuelLevel, int numWheels) {
            super(make, model, fuelLevel);
            this.numWheels = numWheels;
        }

        @Override
        public void startEngine() {
            System.out.println(make + " " + model + " motorcycle engine started. It has " + numWheels + " wheels.");
        }

        @Override
        public void stopEngine() {
            System.out.println(make + " " + model + " motorcycle engine stopped.");
        }

        @Override
        public void polyMethod() {
            System.out.println("This is a motorcycle-specific method in " + make + " " + model + ".");
        }
    }




