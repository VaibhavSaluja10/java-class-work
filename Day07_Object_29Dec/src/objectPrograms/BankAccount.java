package objectPrograms;

public class BankAccount {

    // ---------- Static members ----------
    static String bankName = "State Bank of India";
    static double interestRate = 6.5;

    // ---------- Non-static members ----------
    String holderName;
    double accountNumber;
    double balance;

    // ---------- Constructor 1 (No arguments) ----------
    BankAccount() {
        this("Unknown",2);   // constructor chaining
        System.out.println("Default account created");
    }

    // ---------- Constructor 2 (2 arguments) ----------
    BankAccount(String holderName, int accountNumber) {
        this(holderName, accountNumber, 0.0);  // constructor chaining
    }

    // ---------- Constructor 3 (3 arguments) ----------
    BankAccount(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // ---------- Non-static method ----------
    void displayAccount() {
        System.out.println("Bank Name     : " + bankName);
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Account No    : " + accountNumber);
        System.out.println("Balance       : " + balance);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("---------------------------");
    }
}

