package objectPrograms;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("PanNo");
		Student s3 = new Student("PanNo","AadharNo");
		Student s4 = new Student("PanNo","AadharNo","VoterNo");
		
		System.out.println(s4); // gives reference address
		System.out.println(s1.aadhar); // null
		System.out.println(s2.aadhar); // null
		System.out.println(s3.aadhar); // Aadhar No.
		
		
		
	}

}
