package org.Class19;

class Vehicle {
    private int speed;
    private String color;
    private String fuelType;

    public Vehicle(int speed, String color, String fuelType) {
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating.");
        speed += 10;
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + " is braking.");
        speed -= 5;
    }

    public void displayInfo() {
        System.out.println("Vehicle: Speed = " + speed + ", Color = " + color + ", Fuel Type = " + fuelType);
    }
}

class Truck extends Vehicle {
    public Truck(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }

    public void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating.");
        int speed; // Corrected speed assignment
        speed = 15;
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking.");
        int speed = 7; // Corrected speed assignment
    }
}

class Bicycle extends Vehicle {
    public Bicycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }

    public void pedal() {
        System.out.println("Bicycle is pedaling.");
    }
}


