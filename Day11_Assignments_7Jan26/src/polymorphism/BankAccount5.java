package polymorphism;

class BankAccount {
    public double calculateInterest(double amount) {
        return 0;
    }
}

class SavingsAccount extends BankAccount {
    public double calculateInterest(double amount) {
        return amount * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    public double calculateInterest(double amount) {
        return amount * 0.07;
    }
}

class CurrentAccount extends BankAccount {
    public double calculateInterest(double amount) {
        return 0;
    }
}
