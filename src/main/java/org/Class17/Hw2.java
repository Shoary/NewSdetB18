package org.Class17;
/*  Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
 then the message "I love programming languages" should be printed.
 If some String is passed to it, then in place of "programming languages" the value variable should be printed.
 Example, if we pass "Java", then "I love Java" should be printed.
 */
public class Hw2 {

    private String language;

    // Constructor with a default message
    public Hw2() {
        this.language = "programming languages";
        System.out.println("I love " + this.language);
    }

    // Constructor with a custom message based on the provided language
    public Hw2(String language) {
        this.language = language;
        System.out.println("I love " + this.language);
    }

    public static void main(String[] args) {
        // Creating objects of the Hw2 class
        Hw2 defaultObj = new Hw2();  // Output: I love programming languages
        Hw2 customObj = new Hw2("Java");  // Output: I love Java
    }
}