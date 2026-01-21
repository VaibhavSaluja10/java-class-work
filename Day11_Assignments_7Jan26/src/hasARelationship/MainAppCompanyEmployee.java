package hasARelationship;

public class MainAppCompanyEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);

        Employee[] employees = {emp1, emp2};
        Company company = new Company("Tech Solutions", employees);
        company.displayEmployeeDetails();
    }

}
