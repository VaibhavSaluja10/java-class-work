package inheritance;

public class Child8 extends Parent8 {

    public Child8(String name, int age) {
        super(name, age);
    }

    public void displayDetails() {
        // Accessing protected variables from parent class
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
