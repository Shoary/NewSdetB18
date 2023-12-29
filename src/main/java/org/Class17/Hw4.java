package org.Class17;
/*
Create 1 class with a private method that has 3 overloaded forms.
 Then call each overloaded method with specific arguments and observe result.
 */
public class Hw4 {

    public static void main(String[] args) {
        // Creating an instance of the class to call private methods
        PrivateOverloadedMethods instance = new PrivateOverloadedMethods();

        // Calling each overloaded private method with specific arguments
        instance.displayInfo();                     // Output: Default Information
        instance.displayInfo("Hello, World!");     // Output: Message: Hello, World!
        instance.displayInfo("Java", 42);           // Output: Message: Java, Number: 42
    }
}

class PrivateOverloadedMethods {

    // Private method with three overloaded forms
    void displayInfo() {
        System.out.println("Default Information");
    }

    void displayInfo(String message) {
        System.out.println("Message: " + message);
    }

    void displayInfo(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }
}

