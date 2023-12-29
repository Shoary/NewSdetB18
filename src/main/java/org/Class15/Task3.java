package org.Class15;
/*
Write a Java class that have 4 constructors with 4 different access levels of
constructors (private,public,default,protected)and create 4 objects of this class:1-inside same class;
2-from outside the class;3-from different class inside different package and observe result.
 */
public class Task3 {

    String privateConstructorMessage;
    public String publicConstructorMessage;
    String defaultConstructorMessage; // Package-private (default) access
    protected String protectedConstructorMessage;

    // Private Constructor
    private Task3(String message) {
        privateConstructorMessage = message;
    }

    // Public Constructor
    public Task3(String message, int value) {
        publicConstructorMessage = message + value;
    }

    // Default (Package-private) Constructor
    Task3(int value) {
        defaultConstructorMessage = "Default constructor: " + value;
    }

    // Protected Constructor
    protected Task3(String message, double value) {
        protectedConstructorMessage = message + value;
    }

    public Task3() {

    }

    public static void main(String[] args) {
        // 1. Inside the same class
        Task3 obj1 = new Task3("Private constructor message");
        Task3 obj2 = new Task3("Public constructor message", 42);
        Task3 obj3 = new Task3(10);
        Task3 obj4 = new Task3("Protected constructor message", 3.14);

        System.out.println("Object 1 (Private): " + obj1.privateConstructorMessage);
        System.out.println("Object 2 (Public): " + obj2.publicConstructorMessage);
        System.out.println("Object 3 (Default): " + obj3.defaultConstructorMessage);
        System.out.println("Object 4 (Protected): " + obj4.protectedConstructorMessage);
    }
}


