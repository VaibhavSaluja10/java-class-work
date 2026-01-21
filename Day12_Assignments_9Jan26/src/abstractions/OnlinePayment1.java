// 1. A company is developing an online payment system that supports different payment methods such as Credit Card, UPI, and Net Banking.

//    Create an abstract class Payment
//    It should contain:
//        . an abstract method processPayment(double amount)
//        . a concrete method printReceipt()
//    Create subclasses CreditCardPayment, UPIPayment, and NetBankingPayment
//    Each subclass should implement the payment processing logic
//    Demonstrate abstraction by processing payments using a Payment reference



package abstractions;

public class OnlinePayment1 {
    public static void main(String[] args) {
        Payment1 payment1 = new CreditCardPayment1();
        payment1.processPayment(1500.00);
        payment1.printReceipt();

        Payment1 payment2 = new UPIPayment1();
        payment2.processPayment(750.50);
        payment2.printReceipt();

        Payment1 payment3 = new NetBankingPayment1();
        payment3.processPayment(2000.75);
        payment3.printReceipt();
        
        Payment1 payment4 = new Payment1();
        payment4.processPayment(500.00);
        payment4.printReceipt();
            
       
        

    }


}
