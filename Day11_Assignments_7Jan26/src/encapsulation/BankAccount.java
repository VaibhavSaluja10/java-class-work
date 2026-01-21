// 1. Bank Account
// Write a Java program to create a BankAccount class with
// accountNumber and balance as private
// methods
// deposit(), withdraw(), and getBalance()
// ensure balance cannot be directly modified
package encapsulation;

public class BankAccount {

    @SuppressWarnings("unused")
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public BankAccount() {
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
