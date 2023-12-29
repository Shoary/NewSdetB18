package org.Class17;

public class AnimalTester {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Brown", 5, 10.0);
        Animal.Dog dog = animal.new Dog("Buddy", "Brown", 3, 15.5);
        Animal.Cat cat = animal.new Cat("Whiskers", "Gray", 2, 8.7);

        animal.printInfo();
        dog.printInfo();
        cat.printInfo();
    }
}





