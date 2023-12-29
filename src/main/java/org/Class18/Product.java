package org.Class18;

public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public String toString() {
        return "Product: " + productName + ", Price: $" + price + ", Quantity: " + quantity;
    }
}
