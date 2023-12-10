package Class15;
/*
Write Book class that will have 5 instance variables and 2 Constructors . While creating an object make sure
instance variables are being initialized both constructors are being executed create print info method and call it.
 */
public class Book {
        private String title;
        private String author;
        private int pageCount;
        private double price;
        private boolean isAvailable;

        // Constructor with all parameters
        public Book(String title, String author, int pageCount, double price, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.pageCount = pageCount;
            this.price = price;
            this.isAvailable = isAvailable;
            System.out.println();
        }

        // Default constructor
        public Book() {
            this("Default Title", "Default Author", 0, 0.0, false);
            System.out.println();
        }

        // Method to display information
        public void printInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Page Count: " + pageCount);
            System.out.println("Price: $" + price);
            System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        }

        public static void main(String[] args) {
            // Creating an instance of the Book class using the parameterized constructor
            Book book1 = new Book("Java Programming", "Asghar Nazir", 400, 50.99, true);

            // Calling the printInfo method to display book information
            book1.printInfo();

            System.out.println(); // Adding a newline for better readability

            // Creating an instance of the Book class using the default constructor
            Book book2 = new Book();

            // Calling the printInfo method to display default book information
            book2.printInfo();
        }
    }


