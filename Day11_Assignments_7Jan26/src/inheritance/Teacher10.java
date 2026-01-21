package inheritance;

public class Teacher10 extends Person10 {

    private String subject;
    private double salary;

    public Teacher10(String name, int age, String subject, double salary) {
        super(name, age); // Reusing Person constructor
        this.subject = subject;
        this.salary = salary;
    }

    public void displayTeacherDetails() {
        displayPersonDetails(); // Reusing Person method
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}
