package assignment1;

public class stock {
    public static void main(String[] args) {

        int stock = 11;
        boolean fast = true;
        boolean diss = false;

        boolean reorder = (stock < 10 || (fast && !diss));
        stock += reorder ? 10 : 0;

        System.out.println("Reorder Required: " + reorder);
        System.out.println("Updated Stock Quantity: " + stock);
    }
}
