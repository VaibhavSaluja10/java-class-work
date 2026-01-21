package polymorphism;

abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class DebitCardPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

class UPIPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
