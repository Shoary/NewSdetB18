package Class14;

public class Task2 {

    int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Create an instance of Task2
        Task2 calculator = new Task2();

        // Call the package-private method to calculate the sum
        int sum = calculator.calculateSum(myArray);

        System.out.println("Sum of the array elements: " + sum);
    }
}