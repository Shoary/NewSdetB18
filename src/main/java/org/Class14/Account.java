package org.Class14;

public class Account {


    boolean password;

    public static void main(String[] args) {
        Account a=new Account();
        System.out.println(a.password);
        a.printInfo();
        
        //System.out.println(a.password)
        //a.printInfo();
    }

    void printInfo() {
        System.out.println("welcome to bank of Amarica" );
    }
}
