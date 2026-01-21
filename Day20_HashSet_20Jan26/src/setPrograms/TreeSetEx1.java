package setPrograms;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>(new StudentComparator());
		ts.add(new Student("Vaibhav",1));
		ts.add(new Student("Sahil",10));
		ts.add(new Student("Rohit",5));
		ts.add(new Student("Vaibhav",14));
		ts.add(new Student("Vaibhav",3));
		
		
		System.out.println(ts);
	}
	

}
