package org.Class18;
/*
Create a class Degree having a method 'getPrerequisite'that prints "To get a degree you need high school diploma"
. Class 'Degree' has 2 subclasses namely 'Bachelors' and 'Masters' ; In Masters claSS override method 'getPrerequisite;
.call the method by creating an object of each of the three classes.
 */


class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree, you need a high school diploma.");
    }
}

class Bachelors extends Degree {
    // No need to override getPrerequisite for Bachelors class
}

class Masters extends Degree {

    public void getPrerequisite() {
        System.out.println("To get a master's degree, you typically need a bachelor's degree.");
    }
}

public class Main {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Bachelors bachelors = new Bachelors();
        Masters masters = new Masters();

        // Calling the getPrerequisite method for each class
        degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}


