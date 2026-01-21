package typecasting;

public class typecasting {
	public static void main(String[] args) {
		
		//Widening 
		int num = 12;
		double doub = num;
		
		System.out.println("Implicit Typecasting:");
		System.out.println("Integer value: " + num);
        System.out.println("Converted to Double: " + doub);
        
		// Narrowing
		double doub1 = 9.33;
		int num1 = (int) doub1;
		System.out.println("\nExplicit Typecasting:");
        System.out.println("Double value: " + doub1);
        System.out.println("Converted to Integer: " + num1);
		
		
	}

}
