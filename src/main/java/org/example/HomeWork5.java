package org.example;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {
        
                 Scanner scanner = new Scanner(System.in);

                System.out.print("Enter person's height in inches: ");
                int height = scanner.nextInt();

                if (height < 60) {
                    System.out.println("Person is short.");
                } else if (height >= 60 & height <= 72) {
                    System.out.println("Person is medium.");
                } else {
                    System.out.println("Person is tall.");
                }
            }
        }
