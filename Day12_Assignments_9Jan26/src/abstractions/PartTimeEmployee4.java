package abstractions;

public class PartTimeEmployee4 extends Employee4 {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee4(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
