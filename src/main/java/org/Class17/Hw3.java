package org.Class17;
/*
Create 1 class with a static method that has 3 overloaded forms.
 Then call each overloaded method with specific arguments and observe result.
 */
public class Hw3 {

    // Static method with three overloaded forms
    public static void displayInfo() {
        System.out.println("Default Information");
    }

    public static void displayInfo(String message) {
        System.out.println("Message: " + message);
    }

    public static void displayInfo(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }

    public static void main(String[] args) {
        // Calling each overloaded method with specific arguments
        displayInfo();  // Output: Default Information
        displayInfo("Hello, World!");  // Output: Message: Hello, World!
        displayInfo("Java", 42); // Output: Message: Java, Number: 42
    }
}
