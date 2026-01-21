package programmingPractise;

import java.util.Scanner;

public class ArrayProgram16 {

    // Method to check prime number
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
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

        System.out.println("Prime elements in the array:");

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No prime elements found");
        }

        sc.close();
    }
}
