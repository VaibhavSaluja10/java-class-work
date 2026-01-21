package abstractions;

public class MainAppEmployee4 {

    public static void main(String[] args) {

        // Runtime polymorphism
        Employee4 emp1 = new FullTimeEmployee4(101, "Vaibhav", 50000);
        Employee4 emp2 = new PartTimeEmployee4(102, "Sahil", 80, 500);

        emp1.displayDetails();
        System.out.println();

        emp2.displayDetails();
    }
}
