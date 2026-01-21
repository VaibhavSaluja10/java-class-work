package encapsulation;

public class TestOnlineShoppingCart {
    public static void main(String[] args) {
        OnlineShoppingCart cart = new OnlineShoppingCart();

        // Add items to the cart
        cart.addItem(100.50);
        cart.addItem(250.75);

        // Display total amount
        System.out.println("Total Amount after adding items: " + cart.getTotalAmount());

        // Remove an item from the cart
        cart.removeItem(100.50);

        // Display total amount
        System.out.println("Total Amount after removing an item: " + cart.getTotalAmount());

        // Attempt to remove an item with invalid price
        cart.removeItem(500); // Should display an error message
    }

}
