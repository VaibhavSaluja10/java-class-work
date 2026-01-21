package abstractions;

public abstract class Restaurant5 {

    protected String restaurantName;

    public Restaurant5(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    // Abstract method
    public abstract void prepareFood();

    // Concrete method
    public void orderReceived() {
        System.out.println("Order received at " + restaurantName);
    }
}
