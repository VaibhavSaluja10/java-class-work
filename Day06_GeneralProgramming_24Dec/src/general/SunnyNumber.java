package general;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Sunny number");
        } else {
            System.out.println(original + " is NOT a Sunny number");
        }
        sc.close();
    }
}
