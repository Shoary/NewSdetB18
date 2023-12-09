package org.Class12;

public class StringVsStringBuilder {

    public static void main(String[] args) {

        String address ="USA";
        String address1="USA";
        String address2="USA";
        String address3="USA";
        String address4="USA";
        String address5="USA";
     //   String address5="Canada";

        String add="Canada";
        StringBuffer sb=new StringBuffer("Hello");

        // Check if all addresses are equal
        if (areAllAddressesEqual(address, address1, address2, address3, address4, address5)) {
            System.out.println("All addresses are equal");
        } else {
            System.out.println("Addresses are not equal");
        }

        // Check if the add string is equal to the address5 string
        if (add.equals(address5)) {
            System.out.println("The add string is equal to address5");
        } else {
            System.out.println("The add string is not equal to address5");
        }

        // Example usage of StringBuffer
        System.out.println("Original StringBuffer: " + sb);
        sb.reverse();
        System.out.println("Reversed StringBuffer: " + sb);
    }

    private static boolean areAllAddressesEqual(String... addresses) {
        for (int i = 1; i < addresses.length; i++) {
            if (!addresses[i].equals(addresses[0])) {
                return false;
            }
        }
        return true;
    }



    }

