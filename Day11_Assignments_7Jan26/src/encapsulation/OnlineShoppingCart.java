// Write a Java program where:
// totalAmount is private
// methods to add and remove items
// user cannot directly change total amount



package encapsulation;

public class OnlineShoppingCart {
    private double totalAmount;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addItem(double price) {
        if (price > 0) {
            totalAmount += price;
        } else {
            System.out.println("Item price must be positive.");
        }
    }

    public void removeItem(double price) {
        if (price > 0 && price <= totalAmount) {
            totalAmount -= price;
        } else {
            System.out.println("Invalid item price for removal.");
        }
    }

}
