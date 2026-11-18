/*
 * Task 01: Shoe Product Management
 *
 * Create a ShoeProduct class with product details.
 * Initialize product objects using a parameterized constructor.
 * Display product details using a method.
 */

public class ShoeProduct {
    int productId;
    String productName;
    String brand;
    String category;
    double price;
    public ShoeProduct(int productId, String productName, String brand, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.price = price;
    }
    public void displayProductDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        ShoeProduct product1 = new ShoeProduct(101,"Nike Air Max","Nike","Running",5999.00);
        ShoeProduct product2 = new ShoeProduct(102,"Adidas Ultraboost","Adidas","Sports",7999.00);
        ShoeProduct product3 = new ShoeProduct(103,"Nike Air Max","Nike","Running",5999.00);
        System.out.println("===== SHOE PRODUCT DETAILS =====");
        System.out.println();
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
    }
}

