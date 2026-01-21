package dynamicRead;

import java.util.Scanner;
public class DynamicRead {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		int age = sc.nextInt();
		int marks = sc.nextInt();
		
		char ch = name.charAt(0);
		
		System.out.println("Your Name: "+name);
		System.out.println("Your age: "+age);
		System.out.println("Your marks: "+marks);
		System.out.println("First character of name: "+ch);
		
		sc.close();
	}

}
