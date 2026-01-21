package abstractions;

public class Payment1 {

    public void processPayment(double amount) {
        // Abstract method to be implemented by subclasses
        throw new UnsupportedOperationException("processPayment method not implemented");
    }

    public void printReceipt() {
        System.out.println("Payment processed successfully. Receipt printed.");
    }

}
