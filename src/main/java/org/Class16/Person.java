package org.Class16;

public class Person {


    int age;
    String name; double weight;

    void printInfo() {
        System.out.println(name + " " + age + " " + weight);
    }

    // Student class should be declared outside of the Person class
    static class Student extends Person {

        char grade;

        void study() {
            // implementation of study method
        }
    }

    // StudentTester class should be declared out side of the Person class
    public static class StudentTester {

        public static void main(String[] args) {

            Student student = new Student();
            student.age = 12;

            // Accessing attributes of the Person class
            student.name = "John";
            student.weight = 45.5;

            // Calling the printInfo method
            student.printInfo();
        }
    }
}
