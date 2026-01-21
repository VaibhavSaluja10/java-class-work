package abstractions;

public abstract class Employee4 {

    protected int id;
    protected String name;

    public Employee4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}
