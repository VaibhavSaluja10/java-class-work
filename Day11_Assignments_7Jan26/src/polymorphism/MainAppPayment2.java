package polymorphism;

public class MainAppPayment2 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new DebitCardPayment();
        Payment p3 = new UPIPayment();

        p1.pay(2500);
        p2.pay(1800);
        p3.pay(500);
    }
}
