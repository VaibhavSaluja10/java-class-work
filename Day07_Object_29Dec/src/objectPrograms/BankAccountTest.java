package objectPrograms;

public class BankAccountTest {
    public static void main(String[] args) {

        // Using default constructor
        BankAccount a1 = new BankAccount();

        // Using overloaded constructor
        BankAccount a2 = new BankAccount("Vaibhav", 101);

        // Using overloaded constructor
        BankAccount a3 = new BankAccount("Rahul", 102, 5000);

        a1.displayAccount();
        a2.displayAccount();
        a3.displayAccount();
    }
}

