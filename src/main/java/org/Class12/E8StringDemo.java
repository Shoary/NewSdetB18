package org.Class12;

public class E8StringDemo {
    public static void main(String[] args) {

        String str = "This one should be false ";

        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("one"));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.lastIndexOf('o'));

    }
}
