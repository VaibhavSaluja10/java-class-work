package abstractions;

public class FineDiningRestaurant5 extends Restaurant5 {

    public FineDiningRestaurant5(String restaurantName) {
        super(restaurantName);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing gourmet food carefully (30 minutes).");
    }
}
