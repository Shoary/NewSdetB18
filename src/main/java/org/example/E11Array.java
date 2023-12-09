package org.example;

public class E11Array {

    public static void main(String[] args) {


        int[] numbers={10,25,36,56,80,50,60};

        for ( int number : numbers){
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);

            }
        }


    }
}
