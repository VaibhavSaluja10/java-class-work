package exception1;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		if(b==0) {
			
//			throw new ArithmeticException("Divide by zerooo");
			
			throw new WrongInputException("Teri maa ki aakh");
		}
		else {
			System.out.println(a/b);
		}
	}

}
