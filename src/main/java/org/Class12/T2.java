package org.Class12;

public class T2 {

    public static void main(String[] args) {
        String str = "bkfdSAHBDSH2232398487#Y*$#$#$%";
        String newStr = str.replaceAll("[^A-Za-z]", "");
        System.out.println(newStr);
    }
}

