package Class13;

public class T1 {

    /*  create a method that will take 2 parameters as a numbers and prints which number is larger

     */

        static void printLargerNumber(int num1, int num2) {
            if (num1 > num2) {
                System.out.println(num1 + " is larger than " + num2);
            } else if (num1 < num2) {
                System.out.println(num2 + " is larger than " + num1);
            } else {
                System.out.println("Both numbers are equal");
            }
        }



    public static void main(String[] args) {
        // Example usage of the method
        int number1 = 10;
        int number2 = 30;

        // Then Call the method to compare and print the larger number
        printLargerNumber(number1, number2);
    }
}