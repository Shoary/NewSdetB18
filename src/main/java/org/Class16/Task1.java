package org.Class16;


/* write program from multilevel inheritance  where class Y inherits class X>

  */
class X {
    void displayX() {
        System.out.println("This is class X");
    }
}

// Class Y extends class X
class Y extends X {
    void displayY() {
        System.out.println("This is class Y");
    }

    // Overriding the displayX method in class Y
    @Override
    public void displayX() {
        System.out.println("This is the overridden displayX method in class Y");
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Creating an object of class Y
        Y yObject = new Y();

        // Calling methods from both class X and class Y
        yObject.displayX();
        yObject.displayY();
    }
}

