package encapsulation;

public class TestEmployeeSalary {
	public static void main(String[] args) {
		EmployeeSalary es = new EmployeeSalary();
		
		System.out.println("Employee Salary: "+es.getSalary()); // ByDefault = 0
		es.setSalary(-1);
		es.setSalary(100);
		System.out.println("Employee Salary: "+es.getSalary());
	}

}
