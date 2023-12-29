package org.Class18;

public class LibraryTester {


        public static void main(String[] args) {
            // Instantiate objects from the nested classes
            Library.Book regularBook = new Library().new Book("The Java Programming Language", "James Gosling", "978-0321349804");
            Library.EBook eBook = new Library.EBook("Clean Code", "Robert C. Martin", "978-0132350884", "https://example.com/clean-code-ebook");
            Library.PrintBook printBook = new Library.PrintBook("Design Patterns", "Erich Gamma", "978-0201633610", 500);

            // Demonstrate the display functionality
            System.out.println("Regular Book Details:");
            regularBook.displayBookDetails();
            System.out.println();

            System.out.println("EBook Details:");
            eBook.displayBookDetails();
            System.out.println();

            System.out.println("Print Book Details:");
            printBook.displayBookDetails();
        }
    }

