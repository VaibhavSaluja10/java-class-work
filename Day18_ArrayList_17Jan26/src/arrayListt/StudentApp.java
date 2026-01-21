package arrayListt;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Vaibhav",1));
		al.add(new Student("Sahil",2));
		al.add(new Student("Vaibhav3",3));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		
		ListIterator li = al.listIterator();
		boolean notFound = true;
		
		while(li.hasNext()) {
			Student temp = (Student)li.next();
			if(temp.id==id) {
				notFound=false;
				System.out.println("Student exists...");
				System.out.println("Student Name: "+temp.name);
			}
			if(notFound) {
				System.out.println("Student not in the list....");
			}
			
		}

		
	}
	

}
