package general;

import java.util.Scanner;
public class CountDigit {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int count = 0;
		if(num==0) {
			count=1;
		}else {
			while(num != 0) {
				num = num/10;
				count++;
			}
		}
		System.out.println("No. of digits: "+count);
		sc.close();	
	}

}
