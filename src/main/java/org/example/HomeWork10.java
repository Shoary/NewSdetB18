package org.example;

import java.util.Scanner;

public class WorkHome10 {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    double result;

    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
            break;
        default:
            System.out.println("Error: Invalid operator");
            return;
    }

        System.out.println("Result: " + result);
}









