package arrayListPrograms;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		ArrayList students = new ArrayList();
		students.add(new Student("Vaibhav",1));
		students.add(new Student("Vaibhav2",2));
		students.add(new Student("Vaibhav3",3));
		System.out.println(students);
		
		Object keyElements = new Student("Vaibhav",1);
		System.out.println(students.contains(keyElements));
		
		students.add(10);
		System.out.println(students);
	}

}


// Access element - 3 methods

// 1) getIndex
// 2) for each loop
// 3) Iterator



