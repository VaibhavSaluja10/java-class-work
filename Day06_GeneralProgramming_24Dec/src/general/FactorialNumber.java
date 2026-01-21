package general;

import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of digits: "+fact);
	}
}
