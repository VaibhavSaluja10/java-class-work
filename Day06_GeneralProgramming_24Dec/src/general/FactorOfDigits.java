package general;

import java.util.Scanner;

public class FactorOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;

            System.out.print("Factors of " + digit + " are: ");

            if (digit == 0) {
                System.out.print("Not defined");
            } else {
                for (int i = 1; i <= digit; i++) {
                    if (digit % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
            num = num / 10;
        }
    }
}
