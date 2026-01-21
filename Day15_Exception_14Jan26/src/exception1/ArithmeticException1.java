package exception1;

import java.util.Scanner;

public class ArithmeticException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Arithmetic Exception.
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b); // If there is exception in first line , then another exception not execute.
			
			String s = null;
			System.out.println(s.toUpperCase());
		}
		catch(ArithmeticException e) {
			System.out.println("Caught AE");
			System.out.println(e);
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("Caught NPE");
		}
		catch(NumberFormatException e) {
			System.out.println("Caught NFE");
			
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
			
		}

}
