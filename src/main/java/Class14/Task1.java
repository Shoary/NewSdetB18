package Class14;
/*
Create a method that will accept an array as parameters and will return a sum of all elements
from that array. Method should be visibly only within same package and
 accessible by the creating an instance /object of the class.
 */
class Task1 {
    // Package-private method to calculate the sum of elements in an array
    int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an instance of Task1
        Task1 calculator = new Task1();

        // Example array
        int[] exampleArray = {1, 2, 3, 4, 5};

        // Use the package-private method to calculate the sum
        int result = calculator.sumArray(exampleArray);

        // Print the result
        System.out.println("Sum of elements in the array: " + result);
    }
}

