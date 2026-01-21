//Create an Employee class with:
//salary as private
//methods to set and get salary
//salary cannot be negative


package encapsulation;

public class EmployeeSalary {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary>=0) {
		this.salary = salary;
	}else {
		System.out.println("Invalid input");
	}
	}
}
