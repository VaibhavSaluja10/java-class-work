package polymorphism;

public class MainAppECommerce7 {
    public static void main(String[] args) {

        Customer c1 = new RegularCustomer();
        Customer c2 = new PremiumCustomer();
        Customer c3 = new VIPCustomer();

        System.out.println("Regular Discount: " + c1.calculateDiscount(10000));
        System.out.println("Premium Discount: " + c2.calculateDiscount(10000));
        System.out.println("VIP Discount: " + c3.calculateDiscount(10000));
    }
}
