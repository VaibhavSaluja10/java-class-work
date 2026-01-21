package abstractions;

public class FullTimeEmployee4 extends Employee4 {

    private double monthlySalary;

    public FullTimeEmployee4(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
