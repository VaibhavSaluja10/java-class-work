package polymorphism;

public class MainAppRestaurantBill8 {
    public static void main(String[] args) {

        MenuItem m1 = new VegItem();
        MenuItem m2 = new NonVegItem();

        double total = 0;
        total += m1.calculatePrice(2);
        total += m2.calculatePrice(3);

        System.out.println("Total Bill Amount: " + total);
    }
}
