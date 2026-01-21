
//Write a Java program where:
//A Bank has Account
//Account has accountNumber and balance
//Bank shows account details
//--> Prevent direct access using encapsulation



package hasARelationship;

public class Bank {
    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }

}
