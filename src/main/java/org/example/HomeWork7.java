package org.example;

import java.util.Scanner;
public class HomeWork7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quiz score: ");
        int quizScore = scanner.nextInt();

        System.out.print("Enter midterm score: ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter final score: ");
        int finalScore = scanner.nextInt();

        double averageScore = (quizScore + midtermScore + finalScore) / 3.0;

        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 70) {
            grade = 'B';
        } else if (averageScore >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("The average score is: " + averageScore);
        System.out.println("The corresponding grade is: " + grade);
    }
}



