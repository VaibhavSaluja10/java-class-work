package inheritance;

public class MainAppBank5 {

    public static void main(String[] args) {

        Bank5 bank1 = new SBI5();
        Bank5 bank2 = new HDFC5();

        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + bank2.getInterestRate() + "%");
    }
}
