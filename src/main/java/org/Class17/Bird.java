package org.Class17;

public class Bird {

        private String species;
        private String color;
        private int wingspan;
        private boolean canFly;

        public Bird(String species, String color, int wingspan, boolean canFly) {
            this.species = species;
            this.color = color;
            this.wingspan = wingspan;
            this.canFly = canFly;
        }

        public void printInfo() {
            System.out.println("Species: " + species);
            System.out.println("Color: " + color);
            System.out.println("Wingspan: " + wingspan + " inches");
            System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
        }
    }

    class Sparrow extends Bird {
        public Sparrow(String color, int wingspan, boolean canFly) {
            super("Sparrow", color, wingspan, canFly);
        }
    }

    class Parrot extends Bird {
        public Parrot(String color, int wingspan, boolean canFly) {
            super("Parrot", color, wingspan, canFly);
        }
    }



