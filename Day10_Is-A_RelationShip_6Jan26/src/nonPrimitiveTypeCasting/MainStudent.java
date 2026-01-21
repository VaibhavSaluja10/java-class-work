package nonPrimitiveTypeCasting;

public class MainStudent {
	public static void main(String[] args) {
		
		// UpCasting
		Person p = new Student();  // Upcasting
        p.show();               // allowed
        // p.display();         // ❌ not accessible
        
        Student s = (Student) p;    // downcasting
        s.display();            // now allowed

    }

}
