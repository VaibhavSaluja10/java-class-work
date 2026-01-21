package stringProgram;

public class Example1 {
	public static void main(String[] args) {
		String s1 = "Hello"; // 
		System.out.println(s1);
		
		String s2 = "Hii";
		
		String s3 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		String e1 = new String("Hello");
		String e2 = new String("Hello");
		
		System.out.println(s1==e1); // false // reference
		System.out.println(s1.equals(e1)); // true // value
		
		System.out.println(e1==e2);	// false
		System.out.println(e1.equals(e2)); //true
	}

}
