package org.Class19;


class T3Product {

    private final String name;
    private final double price;
    private final String SKU;

    public T3Product(String name, double price, String SKU) {
        this.name = name;
        this.price = price;
        this.SKU = SKU;
    }

    public double calculateTax() {
        // Default tax calculation, can be overridden by subclasses
        return 0.1 * price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("SKU: " + SKU);
        System.out.println("Tax: $" + calculateTax());
        System.out.println();
    }
}
    class Electronics extends T3Product {

    public Electronics(String name, double price, String SKU) {
        super(name, price, SKU);
    }
    @Override
    public double calculateTax() {
        // Electronics have a different tax rate
        return 0.15 * getPrice();
    }
    private double getPrice() {
        return 0;
    }
    public void applyWarranty() {
        System.out.println("Warranty applied to"+getPrice());
    }
}
    class Clothing extends T3Product {
    public Clothing(String name, double price, String SKU) {
        super(name, price, SKU);
    }
}
    class Furniture extends T3Product {
    public Furniture(String name, double price, String SKU) {
        super(name, price, SKU);
    }
}

class Books extends T3Product {
    public Books(String name, double price, String SKU) {
        super(name, price, SKU);
    }
}
