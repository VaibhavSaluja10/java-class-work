package general;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int sum = 0;

        // Count digits
        int tmp = num;
        while (tmp != 0) {
            count++;
            tmp = tmp / 10;
        }

        // Armstrong calculation
        tmp = num;
        while (tmp != 0) {
            int digit = tmp % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            tmp = tmp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
        sc.close();
        
    }
   
}
