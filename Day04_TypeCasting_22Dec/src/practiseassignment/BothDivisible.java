package practiseassignment;

import java.util.Scanner;

public class BothDivisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		String res = (num%5==0 && num%11==0)?"Divisible by both 5 and 11":"Not eligible by both 5 and 11";
		System.out.println(res);
	}

}
