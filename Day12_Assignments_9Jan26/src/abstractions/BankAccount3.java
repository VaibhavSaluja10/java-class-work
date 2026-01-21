package abstractions;

public abstract class BankAccount3 {

    protected double balance;

    public BankAccount3(double balance) {
        this.balance = balance;
    }

    // Abstract method
    public abstract double calculateInterest();

    // Concrete method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Concrete method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
