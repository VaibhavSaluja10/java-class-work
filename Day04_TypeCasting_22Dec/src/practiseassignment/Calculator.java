package practiseassignment;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first No. ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second No. ");
		int num2 = sc.nextInt();
		System.out.print("Enter perform:(Add,Sub,Div,Mul) ");
		String perform = sc.next();
		
		sc.close();
		
		switch(perform) {
		case "Add" : System.out.println("Addition : "+(num1+num2));break;
		case "Sub" : System.out.println("Substraction : "+(num1-num2));break;
		case "Mul" : System.out.println("Multiplication : "+(num1*num2));break;
		case "Div" : System.out.println("Addition : "+(num1/num2));break;
		default: System.out.println("Error");
		}
		
		
		
		
}}