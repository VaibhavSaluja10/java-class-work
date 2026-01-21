package practiseassignment;

import java.util.Scanner;
public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		if(num>=0 || num<0) {
			if(num>0) {
				System.out.println("Positive");
			}
			if(num<0) {
				System.out.println("Negative");
			}
			if(num==0) {
				System.out.println("Equal to Zero");
			}
		}
		
	}

}
