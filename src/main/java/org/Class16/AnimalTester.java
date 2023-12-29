package org.Class16;

public class AnimalTester {

    public static void main(String[] args) {

        Dog d=new Dog();
        d.name="Melo";
        d.age=10;
        d.color="Black";
        d.weight=20;
        d.printInfo();
        d.bark();

        Cat c=new Cat();
        c.name="Lolo";
        c.age=2;
        c.color="White";
        c.weight=3;
        c.sleep();
        c.printInfo();

       Animal a=new Animal();
       a.name="lolo";



    }
}
