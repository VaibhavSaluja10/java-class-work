package looping;

import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ab;
		
		do {
			System.out.println("Welcome");
			System.out.println("Do you want to print again(Y|N)?");
			ab = sc.next().charAt(0);
			sc.close();
		}
		while(ab=='Y');
		
		sc.close();	
	}
}
