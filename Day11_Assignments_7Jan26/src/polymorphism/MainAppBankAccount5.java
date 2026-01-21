package polymorphism;

public class MainAppBankAccount5 {
    public static void main(String[] args) {

        BankAccount b1 = new SavingsAccount();
        BankAccount b2 = new FixedDepositAccount();
        BankAccount b3 = new CurrentAccount();

        System.out.println("Savings Interest: " + b1.calculateInterest(100000));
        System.out.printf("Fixed Deposit Interest: %.2f%n", b2.calculateInterest(100000));
        System.out.println("Current Account Interest: " + b3.calculateInterest(100000));
    }
}
