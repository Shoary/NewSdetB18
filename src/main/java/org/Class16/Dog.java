package org.Class16;

public class Dog {

    String name;
    String color;
    int age;
    double weight;
    void bark(){
        System.out.println("Wuff wuff");
    }

    void sleep(){
        System.out.println("Zzzz");
    }

    public  void printInfo(){

        System.out.println(name+" "+ color+" "+ age+" "+ weight);

    }
}
