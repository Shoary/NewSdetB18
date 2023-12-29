package org.Class17;

public class E1MethodOverLoading {

    static class MyMath {

        static int add(int num1, int num2) {
            System.out.println(num1 + num2);
            return num1;
        }

        static double add(double num1, double num2) {
            System.out.println(num1 + num2);
            return num1;
        }

        static void add(double num1, double num2, double num3) {
            System.out.println(num1 + num2 + num3);
        }

        static void add(double num1, int num2) {
            System.out.println(num1 + num2);
        }
    }

    public static class MethodOverLoading {
        public static void main(String[] args) {
            MyMath.add(10, 20);
            MyMath.add(15.5, 25.5);
            MyMath.add(15.5, 25.5, 25.5);

            System.out.println(10);
            System.out.println("name");
            System.out.println(true);
        }
    }
}



