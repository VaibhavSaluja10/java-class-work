package practiseassignment;

import java.util.Scanner;
public class MaxThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 10
		int num2 = sc.nextInt(); // 11
		int num3 = sc.nextInt(); // 12
		sc.close();
		
		if(num1>num2 || num2>num3 || num3>num1) {
			if(num1>num3 && num1>num2) {
				System.out.println("Num1 is largest");
			}
			if(num2>num1 && num2>num3) {
				System.out.println("Num2 is largest");
			}
			if(num3>num2 && num3>num1) {
				System.out.println("Num3 is largest");
				
			}
			
		}
		
		
	}

}
