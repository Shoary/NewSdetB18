package org.Class19;

public class CommerceSystem {

    public static void main(String[] args) {
        T3Product[] products = new T3Product[4];

        products[0] = new Electronics("Smartphone", 500.0, "SKU123");
        products[1] = new Clothing("T-Shirt", 20.0, "SKU456");
        products[2] = new Furniture("Desk", 150.0, "SKU789");
        products[3] = new Books("Java Programming", 45.0, "SKU101");

        for (T3Product product : products) {
            product.displayInfo();

            if (product instanceof Electronics) {
                ((Electronics) product).applyWarranty();
            }

            System.out.println("---------");
        }
    }
}
