package practiseassignment;

import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch== 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("Character is Vowel");
		}
		else {
			System.out.println("Character is Consonant");
		}
		sc.close();
	}

}
