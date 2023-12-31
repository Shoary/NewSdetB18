package org.Class22;

public class ProductTester {

    public static void main(String[] args) {
        // Test your class
        Product product = new Product("P001", "Laptop", 777.99, 50);

        // Modify product details using setters
        product.setProductName("Acer Laptop");
        product.setPrice(950.99);
        product.setStockQuantity(60);

        // Perform restocking and selling operations
        product.restock(10);
        double salePrice = product.sell(5);

        // Print product details to verify
        product.printProductDetails();
        System.out.println("Total Sale Price: $" + salePrice);
    }
}
