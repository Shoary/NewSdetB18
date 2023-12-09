package org.example;

public class EnhancedForLoopTask3 {

    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        boolean isSorted = isSortedArray(numbers);
        System.out.println(isSorted);
    }

    private static boolean isSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

