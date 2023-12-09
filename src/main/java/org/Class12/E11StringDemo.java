package org.Class12;

public class E11StringDemo {
    public static void main(String[] args) {
        String str = "My name is James my Number is  6827023308";
        String number=str.replaceAll("[^0-9]","");
        System.out.println(number);
    }
}
