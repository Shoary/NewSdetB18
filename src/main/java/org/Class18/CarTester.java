package org.Class18;

public class CarTester {


        public static void main(String[] args) {
            CarRental car1 = new CarRental("Toyota", "Corolla", 2020);
            System.out.println(car1.calculateRentalPrice(7));

            LuxuryCar luxuryCar = new LuxuryCar("Lamborghini", "Aventador", 2021);
            System.out.println(luxuryCar.calculateRentalPrice(7));

            EconomyCar economyCar = new EconomyCar("Nissan", "Versa", 2019);
            System.out.println(economyCar.calculateRentalPrice(7));
        }
    }

