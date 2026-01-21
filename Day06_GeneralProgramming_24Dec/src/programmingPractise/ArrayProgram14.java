package programmingPractise;

import java.util.Scanner;

public class ArrayProgram14 {

    // Method to check Armstrong number (without Math.pow)
    static boolean isArmstrong(int num) {
        int original = num;
        int count = 0;
        int sum = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum += power;
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the numbers for array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Armstrong elements in the array:");

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (isArmstrong(array[i])) {
                System.out.print(array[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong elements found");
        }

        sc.close();
    }
}
