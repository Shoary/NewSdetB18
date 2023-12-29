package org.Class18;

class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String productName, double price, int quantity, double discountRate) {
        super(productName, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        double discountedPrice = super.calculateTotalPrice() * (1 - discountRate);
        return discountedPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", Discount Rate: " + discountRate * 100 + "%";
    }
}

 class ProductTester
{
    public static void main(String[] args) {
        // Create an instance of the Product class
        Product regularProduct = new Product("Regular Item", 20.0, 3);
        System.out.println(regularProduct);
        System.out.println("Total Price: $" + regularProduct.calculateTotalPrice());

        System.out.println(); // Just for formatting in the output

        // Create an instance of the DiscountedProduct class
        DiscountedProduct discountedProduct = new DiscountedProduct("Discounted Item", 30.0, 2, 0.2);
        System.out.println(discountedProduct);
        System.out.println("Total Price (After Discount): $" + discountedProduct.calculateTotalPrice());
    }
}

