package org.Class21;

public class VehicleTester {

    public static class Main {
        public static void main(String[] args) {
            Vehicle car = new Car("Toyota", "Camry", 30, 4);
            Vehicle truck = new Truck("Ford", "F-150", 50, 2000);
            Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 10, 2);

            car.startEngine();
            car.fuelUp(10);
            car.stopEngine();
            car.polyMethod();

            truck.startEngine();
            truck.fuelUp(20);
            truck.stopEngine();
            truck.polyMethod();

            motorcycle.startEngine();
            motorcycle.fuelUp(5);
            motorcycle.stopEngine();
            motorcycle.polyMethod();
        }
    }
}
