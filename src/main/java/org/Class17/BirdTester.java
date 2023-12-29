package org.Class17;

public class BirdTester {


        public static void main(String[] args) {
            // Create objects of Sparrow and Parrot
            Sparrow sparrow = new Sparrow("Brown", 10, true);
            Parrot parrot = new Parrot("Colorful", 15, true);

            // Call printInfo method for each object
            System.out.println("Sparrow Details:");
            sparrow.printInfo();
            System.out.println();

            System.out.println("Parrot Details:");
            parrot.printInfo();
        }
    }

