 package encapsulation;


 public class TestBankAccount {
     public static void main(String[] args) {
         BankAccount account = new BankAccount("123456789", 1000.0);
         account.deposit(500.0);
         account.withdraw(200.0);
         account.withdraw(100.0);
         System.out.println("Current balance: " + account.getBalance());
     }
 }