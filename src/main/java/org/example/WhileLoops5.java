package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops5 {

    public static void main(String[] args) {


        String sentence ="flapjacks are awesome!";
        Scanner scanner= new Scanner(sentence);
        ArrayList<String>words =new ArrayList<String>();

        while (scanner.hasNext()) {
            words.add(scanner.next());

            System.out.println(words);

        }
    }
}
