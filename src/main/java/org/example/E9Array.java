package org.example;

public class E9Array {

    public static void main(String[] args) {

        int[] numbers={10,25,36,56,80,50,60};


        // write elements at even indexes


        for (int i = 0; i < numbers.length; i =i+ 2) {

            System.out.println( numbers[i]);
        }

        for (int  n: numbers){
            System.out.println(n);

        }
    }
}



