package abstractions;

public class CurrentAccount3 extends BankAccount3 {

    private static final double INTEREST_RATE = 0.01; // 1%

    public CurrentAccount3(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
