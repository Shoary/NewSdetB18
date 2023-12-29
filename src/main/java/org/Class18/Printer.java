package org.Class18;
/* overload

 */
public class Printer {

    private void print(){

        System.out.println("Hello");


    }

    private void print(String word){

        System.out.println(word);
    }

    public static void main(String[] args) {
        Printer P=new Printer();
        P.print();
        P.print("Java");
    }
}

