import java.util.ArrayList;
import java.util.List;

// Product class to represent individual products
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Shopping cart class to manage the products added by the user
class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

// Checkout class to handle the checkout process
class Checkout {
    public void processPayment(ShoppingCart cart) {
        double total = cart.calculateTotal();
        System.out.println("Payment processed successfully.");
        System.out.println("Total amount: $" + total);
    }
}

// Main class to test the E-commerce system
public class ECommerceSystem {
    public static void main(String[] args) {
        // Creating some sample products
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Smartphone", 599.99);
        Product headphones = new Product("Headphones", 99.99);

        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding products to the cart
        cart.addItem(laptop);
        cart.addItem(phone);
        cart.addItem(headphones);

        // Displaying the cart contents
        cart.displayCart();

        // Checking out
        Checkout checkout = new Checkout();
        checkout.processPayment(cart);
    }
}
