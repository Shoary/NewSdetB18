package org.Class18;

public class CarRental {
        String make;
        String model;
        int year;

        public CarRental(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public double calculateRentalPrice(int days) {
            return 50 * days;
        }
    }

        class LuxuryCar extends CarRental {
        public LuxuryCar(String make, String model, int year) {
            super(make, model, year);
        }

        @Override
        public double calculateRentalPrice(int days) {
            return 100 * days + 500;
        }
    }
        class EconomyCar extends CarRental {
        public EconomyCar(String make, String model, int year) {
            super(make, model, year);
        }
    }


