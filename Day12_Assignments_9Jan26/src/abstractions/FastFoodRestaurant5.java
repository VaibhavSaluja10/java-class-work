package abstractions;

public class FastFoodRestaurant5 extends Restaurant5 {

    public FastFoodRestaurant5(String restaurantName) {
        super(restaurantName);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing fast food quickly (10 minutes).");
    }
}
