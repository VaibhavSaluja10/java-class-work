package arrayListt;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Vaibhav",1));
		al.add(new Employee("Sahil",2));
		al.add(new Employee("Vaibhav3",3));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		
		ListIterator li = al.listIterator();
		boolean notFound = true;
		
		while(li.hasNext()) {
			Employee temp = (Employee)li.next();
			if(temp.name==name) {
				notFound=false;
				System.out.println("Employee name exists...");
				System.out.println("Employee Name: "+temp.name);
			}
			if(notFound) {
				System.out.println("Employee not in the list....");
			}
			
		}

		
	}
	

}
