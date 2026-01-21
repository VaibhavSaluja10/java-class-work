package exception1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Arithmetic Exception.
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		System.out.println("End");
	
		
		
		
		
		// NullPointer Exception
//		String s = null;
//		System.out.println(s.toUpperCase());
		
		
		//NumberFormatException
//		int i = Integer.parseInt("123ab");
//		System.out.println(i);
		
		
//		StringIndexOutOfBound Exception
//		String s1 = "Hello";
//		System.out.println(s1.charAt(10));
		
		
		
	}

}
