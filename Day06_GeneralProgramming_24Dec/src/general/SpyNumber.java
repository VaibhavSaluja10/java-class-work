package general;

import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int product = 1;
		int sum=0;
		
		while(num!=0) {
				sum+=num%10;
				product*=num%10; 
				num=num/10;  
			}
		
		boolean check = (product==sum)?true:false;
		
		System.out.println("Spy number or not: "+ check);
	}
}
