package org.Class12;

import org.jetbrains.annotations.NotNull;

public class T4 {

    public static void main(String[] args) {

        String fatherName="ShoAry";
        String motherName="Nagham Salih";
        boolean isBoy=true;

        if (isBoy) {
            String fatherFirstPart = fatherName.substring(0, fatherName.length() / 2);
            String motherLastPart = motherName.substring(motherName.length() / 2, motherName.length());
            System.out.println(fatherFirstPart.trim() + motherLastPart.trim());
        }else {

            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());

        }
        }


    }







