package Class13;
/* Create a method that will print whether given String is palindrome or not.


 */
public class T3 {

    // Method to check if a string is a palindrome and print the result
    static void checkPalindrome(String inputString) {
        // Remove spaces and convert to lowercase for case-insensitive palindrome check
        String cleanedString = inputString.replaceAll("\\s", "").toLowerCase();

        // Initialize variables for checking palindrome
        int left = 0;
        int right = cleanedString.length() - 1;
        boolean isPalindrome = true;

        // Check palindrome condition
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print the result
        if (isPalindrome) {

            System.out.println("\"" + inputString + "\" is a palindrome");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome");
        }
    }

    public static void main(String[] args) {
        // Example usage of the method
        String examplePalindrome = "Anas was I ere I saw Aghsur";
        String exampleNotPalindrome = "Hello World";

        // Call the method to check and print whether the strings are palindromes
        checkPalindrome(examplePalindrome);
        checkPalindrome(exampleNotPalindrome);
    }
}


