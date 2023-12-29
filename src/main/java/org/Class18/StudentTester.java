package org.Class18;

public class StudentTester {

    public static void main(String[] args) {
        Student s = new Student("John", 20, 70.5, 85.5);
        s.printInfo();
        System.out.println(s.getName());
    }
}