package org.Class18;

/*
Create a class CreditCard create an instance method that will calculate intrest based on the given blance.
. create 2 subclasses: Visa and AX. In AX class override method calculate intrest.
.call the method by creating an object of each of the three classes
 */

public class CreditCard {
    protected double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        // Default interest calculation for generic CreditCard
        return balance * 0.1; // Just an example, you can adjust the interest calculation as needed
    }
}

class Visa extends CreditCard {
    public Visa(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        // Override interest calculation for Visa
        return balance * 0.08; // Just an example, you can adjust the interest calculation as needed
    }
}

class AX extends CreditCard {
    public AX(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        // Override interest calculation for AX
        return balance * 0.06; // Just an example, you can adjust the interest calculation as needed
    }
}

class CreditCardTester {
    public static void main(String[] args) {
        CreditCard genericCard = new CreditCard(1000);
        Visa visaCard = new Visa(1000);
        AX axCard = new AX(1000);

        // Calling the calculateInterest method for each class
        System.out.println("Generic Card Interest: " + genericCard.calculateInterest());
        System.out.println("Visa Card Interest: " + visaCard.calculateInterest());
        System.out.println("AX Card Interest: " + axCard.calculateInterest());
    }
}


