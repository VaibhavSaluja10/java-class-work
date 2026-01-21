package exception1;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		try {
		System.out.println(a/b);
		System.out.println("Hii1");
		}
		catch(Exception e) {
			System.out.println("Caught");
			System.out.println("Hii2");
		}
		finally {
			System.out.println("Hii");
			
			
		}
	}

}
