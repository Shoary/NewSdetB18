package Class15;

public class Task3Tester {
    public static void main(String[] args) {
        // 1. Inside the same class
        Task3 obj1 = new Task3();
        Task3 obj2 = new Task3("Public constructor message", 42);
        Task3 obj3 = new Task3(10);
        Task3 obj4 = new Task3("Protected constructor message", 3.14);

        System.out.println("Object 1 (Private): " + obj1.privateConstructorMessage);
        System.out.println("Object 2 (Public): " + obj2.publicConstructorMessage);
        System.out.println("Object 3 (Default): " + obj3.defaultConstructorMessage);
        System.out.println("Object 4 (Protected): " + obj4.protectedConstructorMessage);

        // 2. Attempt to create object using the default constructor from a different package
        // Uncommenting the line below may result in a compilation error
        /*
        Task3 obj5 = new Task3("Attempt to use default constructor from different package"); // Error
        */
    }
}
