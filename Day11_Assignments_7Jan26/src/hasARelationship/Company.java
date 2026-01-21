//Write a Java program where:
//A Company has Employee
//Employee has id, name, and salary
//Company displays employee details
//--> Use constructor to pass Employee object


package hasARelationship;

public class Company {
    private String companyName;
    private Employee[] employees;

    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee Salary: " + emp.getSalary());
            System.out.println("-----------------------");
        }
    }

}
