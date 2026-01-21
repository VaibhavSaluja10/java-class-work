package abstractions;

public class MainAppFood5 {

    public static void main(String[] args) {

        // Runtime polymorphism using abstraction
        Restaurant5 restaurant1 = new FastFoodRestaurant5("Burger Hub");
        Restaurant5 restaurant2 = new FineDiningRestaurant5("Royal Cuisine");

        restaurant1.orderReceived();
        restaurant1.prepareFood();

        System.out.println();

        restaurant2.orderReceived();
        restaurant2.prepareFood();
    }
}
