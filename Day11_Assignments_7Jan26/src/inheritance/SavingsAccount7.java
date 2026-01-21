package inheritance;

public class SavingsAccount7 extends Account7 {

    private double interestRate;

    // Constructor using super keyword
    public SavingsAccount7(int accountNo, double interestRate) {
        super(accountNo);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
