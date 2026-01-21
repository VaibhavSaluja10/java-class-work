package abstractions;

public class SavingsAccount3 extends BankAccount3 {

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount3(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
