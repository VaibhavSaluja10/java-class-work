package hasARelationship;

public class MainAppBankAccount {
    public static void main(String[] args) {
        Account account = new Account("123456789", 1000.50);
        Bank bank = new Bank(account);
        bank.showAccountDetails();
    }

}
