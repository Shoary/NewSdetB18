package org.Class17;
/*
 Create a method to find the minimum of two numbers.
 Method will be passed two parameters and will return the minimum number.
  Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5
 */
public class Hw1 {

    public static void main(String[] args) {
        int result1 = findMinimum(10, 5);
        System.out.println(result1);  // Output: 5

        double result2 = findMinimum(2.5, 3.5);
        System.out.println(result2);  // Output: 2.5
    }

    public static int findMinimum(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static double findMinimum(double num1, double num2) {
        return Math.min(num1, num2);
    }
}










