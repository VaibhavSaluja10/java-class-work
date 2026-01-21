package general;

import java.util.Scanner;
public class ProductOfDigit {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int product = 1;
		
		while(num!=0) {
				product*=num%10; 
				num=num/10;  
				
			}
		
		System.out.println("Product of digits: "+product);
	}
}
