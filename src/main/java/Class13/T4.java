package Class13;
/*
Create a method that will say Hello in different language based on the country that will passed when method is executed.
Do it for any five countries
 */
public class T4 {
    public static void main(String[] args) {
        // Test the method with different countries
        greetInDifferentLanguages("USA");  // Output: Hello
        greetInDifferentLanguages("France");  // Output: Bonjour
        greetInDifferentLanguages("Germany");  // Output: Guten Tag
        greetInDifferentLanguages("Brazil");  // Output: Olá
    }

    // Method to say "Hello" in different languages based on the country
    private static void greetInDifferentLanguages(String country) {
        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("Hello");
                break;
            case "france":
                System.out.println("Bonjour");
                break;
            case "germany":
                System.out.println("Guten Tag");
                break;
            case "brazil":
                System.out.println("Olá");
                break;
            default:
                System.out.println("Greetings not available for this country");
        }
    }

}
