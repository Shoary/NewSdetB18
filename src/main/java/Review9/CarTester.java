package Review9;

public class CarTester {

    public static void main(String[] args) {

        Horse horse = new Horse();
        Car car = new Car();

        // Test WashAble interface
        System.out.println("Washable Interface:");
        horse.wash();
        car.wash();

        // Test TrustAble interface
        System.out.println("\nTrustAble Interface:");
        horse.trust();
        car.trust();
    }
}
