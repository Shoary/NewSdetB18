package org.Class16;
/*
Write program to inherit class E that has method print F which is static and call or reuse that method into class F
 */
public class ClassE {

    static class E {
        static void printF() {
            System.out.println("Method from class E");
            System.out.println("Method from class F");
        }
    }

    static class F extends E {
        public static void main(String[] args) {
            // Calling/reusing the static method from class E
            printF();
        }
    }

}

    
