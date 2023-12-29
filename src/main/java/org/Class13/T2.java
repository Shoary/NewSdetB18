package org.Class13;
 /* Create a method that will take a number and prints whether the number is even or odd.

  */
public class T2 {

     // Method to check if a number is even or odd and print the result
     static void checkEvenOrOdd(int number) {
         if (number % 2 == 0) {
             System.out.println(number + " is an even number");
         } else {
             System.out.println(number + " is an odd number");
         }
     }

     public static void main(String[] args) {
         // Example usage of the method
         int exampleOddNumber = 9;
         int exampleEvenNumber = 10;

         // Call the method to check and print whether the number is even or odd
         checkEvenOrOdd(exampleOddNumber);
         checkEvenOrOdd(exampleEvenNumber);
     }
 }
