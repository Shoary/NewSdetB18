package org.example;

public class ArrayT3 {

    public static void main(String[] args) {

        String[][] studentData = {
                {"Anes", "Bob", "Charis", "Maya"},
                {"A", "B", "C", "A"}
        };

        // Print names of students with A and B grades
        System.out.println("Students with A and B grades:");
        for (int i = 0; i < studentData[0].length; i++) {
            String name = studentData[0][i];
            String grade = studentData[1][i];

            if (grade.equals("A") || grade.equals("B")) {
                System.out.println(name + ": " + grade);
            }
        }
    }
}

