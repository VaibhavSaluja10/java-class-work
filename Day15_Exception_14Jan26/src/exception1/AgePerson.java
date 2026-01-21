package exception1;

import java.util.Scanner;

public class AgePerson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age value");
		int a = sc.nextInt();
		
		if(a<18) {
			throw new UnderAgeException("Your age is less than 18");
		}
		else if(a>42) {
			throw new OverAgeException("Your age is above 41");
		}
		else {
			System.out.println("Your age is between 18 to 41");
		}
	}

}
