package org.Class17;

public class MinFinder {


        public static <T extends Comparable<T>> T findMin(T num1, T num2) {
            return (num1.compareTo(num2) < 0) ? num1 : num2;
        }

        public static void main(String[] args) {
            // Examples
            int intResult = findMin(10, 5);
            System.out.println("Minimum of (10, 5): " + intResult);

            double doubleResult = findMin(2.5, 3.5);
            System.out.println("Minimum of (2.5, 3.5): " + doubleResult);
        }
    }


