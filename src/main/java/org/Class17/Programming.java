package org.Class17;

public class Programming {

        private String value;

        // Constructor with default message
        public Programming() {
            this.value = "programming languages";
        }

        // Constructor with a custom message
        public Programming(String value) {
            this.value = value;
        }

        public void printMessage() {
            System.out.println("I love " + value);
        }

        public static void main(String[] args) {
            // Creating an object with the default message
            Programming defaultObject = new Programming();
            defaultObject.printMessage();

            // Creating an object with a custom message
            Programming customObject = new Programming("Java");
            customObject.printMessage();
        }
    }

