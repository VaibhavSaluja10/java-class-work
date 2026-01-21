package dynamicRead;

import java.util.Scanner;
public class practise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans = sc.next().charAt(0);
		System.out.println("Enter your Answer: "+ans);
		sc.close();
		
		switch(ans) {
		case ('A'): System.out.println("Apple"); break;
		case ('B'): System.out.println("Banana");break;
		case ('C'): System.out.println("Carrot");break;
		case ('D'): System.out.println("Dog");break;
		default:System.out.println("Limit ");
		
		}
		
	}

}
