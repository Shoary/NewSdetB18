package org.Class19;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Truck(40, "Blue", "Diesel"),
                new Motorcycle(80, "Black", "Petrol"),
                new Bicycle(15, "Green", "None")
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.accelerate();
            vehicle.brake();

            if (vehicle instanceof Truck) {
                ((Truck) vehicle).loadCargo();
            } else if (vehicle instanceof Bicycle) {
                ((Bicycle) vehicle).pedal();
            }

            System.out.println();
        }
    }
}



