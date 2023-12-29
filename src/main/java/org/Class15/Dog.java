package org.Class15;

public class Dog {

    String name;
    String breed;
    String color;
   private int age;

    Dog(String dName,String dBreed,String dColor,int dAge){
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;

    }

    void printInfo(){

        System.out.println(name+" "+ breed+" "+color+" "+ age);

    }

}
