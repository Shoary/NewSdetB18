package org.Class22;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getter for productID
    public String getProductID() {
        return productID;
    }

    // Getter and Setter for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for stockQuantity
    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Additional methods
    public void restock(int amount) {
        this.stockQuantity += amount;
    }

    public double sell(int amount) {
        if (amount <= stockQuantity) {
            stockQuantity -= amount;
            return amount * price;
        } else {
            System.out.println("Insufficient stock to sell.");
            return 0;
        }
    }

    public void printProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}


