package org.Class18;

public class Library {
    class Book {
        protected String title;
        protected String author;
        protected String ISBN;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }
        public void displayBookDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }
    static class EBook {
        private String downloadLink;

        public EBook(String title, String author, String ISBN, String downloadLink) {
            super();
            this.downloadLink = downloadLink;
        }

        public void displayBookDetails() {
        }
    }

    static class PrintBook {
        private int numberOfCopies;

        public PrintBook(String title, String author, String ISBN, int numberOfCopies) {
            super();
            this.numberOfCopies = numberOfCopies;
        }

         void displayBookDetails() {
        }
    }
    }


