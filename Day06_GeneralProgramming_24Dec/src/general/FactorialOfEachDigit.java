package general;

import java.util.Scanner;

public class FactorialOfEachDigit {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + digit + " is: " + fact);

            num = num / 10;   // move to next digit
        }
    }
}
