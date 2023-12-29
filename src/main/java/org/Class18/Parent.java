package org.Class18;

public class Parent {
    void marry() {
        System.out.println("Marry the girl that we have selected for you");
    }

    void sleep() {
        System.out.println("Sleep 8 hours");
    }
}

class Karimi extends Parent {
    @Override
    void marry() { System.out.println("I want to marry Nagham Salih");}

    }

class Tester {
    public static void main(String[] args) {
        Karimi k = new Karimi();
        k.marry();
        k.sleep(); // You can also call the sleep method from the Parent class
    }
}

