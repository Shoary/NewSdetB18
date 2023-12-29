package org.Class17;

public class StaticMethod {


        // Static method with three overloaded forms
        public static void printInfo() {
            System.out.println("Default Info");
        }

        public static void printInfo(String message) {
            System.out.println("Info: " + message);
        }

        public static void printInfo(String message, int number) {
            System.out.println("Info: " + message + ", Number: " + number);
        }

        public static void main(String[] args) {
            // Call each overloaded method with specific arguments
            printInfo();
            printInfo("Hello, Java!");
            printInfo("Overloaded Method", 42);
        }
    }

    class PrivateMethodExample {

        // Private method with three overloaded forms
        private void displayInfo() {
            System.out.println("Default Info");
        }

        private void displayInfo(String message) {
            System.out.println("Info: " + message);
        }

        private void displayInfo(String message, double value) {
            System.out.println("Info: " + message + ", Value: " + value);
        }

        public void callPrivateMethods() {
            // Call each overloaded private method with specific arguments
            displayInfo();
            displayInfo("Private Method Example");
            displayInfo("Private Overloaded Method", 3.14);
        }

        public static void main(String[] args) {
            // Create an instance of PrivateMethodExample and call private methods
            PrivateMethodExample privateExample = new PrivateMethodExample();
            privateExample.callPrivateMethods();
        }
    }


