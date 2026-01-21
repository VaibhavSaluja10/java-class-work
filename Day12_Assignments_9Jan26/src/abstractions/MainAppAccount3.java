package abstractions;

public class MainAppAccount3 {

    public static void main(String[] args) {

        // Runtime polymorphism
        BankAccount3 account1 = new SavingsAccount3(10000);
        BankAccount3 account2 = new CurrentAccount3(20000);

        account1.deposit(2000);
        account1.withdraw(1500);
        System.out.println("Savings Account Interest: " + account1.calculateInterest());

        System.out.println();

        account2.deposit(5000);
        account2.withdraw(3000);
        System.out.println("Current Account Interest: " + account2.calculateInterest());
    }
}
