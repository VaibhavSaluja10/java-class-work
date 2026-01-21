package assignment1;

public class board {
    public static void main(String[] args) {

        int units = 350;
        boolean commercial = false;

        double rate = (units > 300 || commercial) ? 8.0 : 5.0;
        double bill = units * rate;

        bill += bill * 0.10;

        System.out.println("Units Consumed: " + units);
        System.out.println("Billing Rate: " + rate);
        System.out.println("Total Bill Amount: " + bill);
    }
}
