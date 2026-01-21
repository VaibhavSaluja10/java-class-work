package objectPrograms;

public class Static {
	public static void m1() {
		System.out.println("Static Method");
		
	}
	
	public static void main(String[] args) {
		m1();   // Static Method
		// or
		Static.m1(); // Static Method
	}

}
