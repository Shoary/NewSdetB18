package org.example;

public class HomeWork22 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        int largest = numbers[0];
        for(int number : numbers) {
            sum += number;
            if(number > largest){
                largest = number;
            }
        }

        System.out.println( sum);

        System.out.println( largest);
    }
}


