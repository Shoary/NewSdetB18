package org.example;

public class HomeWork21 {

    public static void main(String[] args) {

        int[] numbers = {10, 55, 23, 66, 42};

        int largest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println( largest);
    }
}

