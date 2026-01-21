package practiseassignment;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second side: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third side: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Equilateral");
        } 
        else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Isosceles");
        } 
        else {
            System.out.println("Scalene");
        }

        sc.close();
    }
}
