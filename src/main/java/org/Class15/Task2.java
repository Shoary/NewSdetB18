package org.Class15;

/*
write a java Class Students that have a constructor which takes students name and 3 subject grades .
Inside your class also have a method to Calculate Average Grade .
Test student class for 2 different students with different marks.
 your program should print an average mark of each student name
 */

public class Task2 {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    // Constructor
    public Task2(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    // Getter method for the student's name
    public String getName() {
        return name;
    }

}




