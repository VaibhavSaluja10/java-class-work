package programmingPractise;

import java.util.Scanner;

public class ArrayProgram15 {

    // Method to check palindrome number
    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
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

        System.out.println("Palindrome elements in the array:");

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (isPalindrome(array[i])) {
                System.out.print(array[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No palindrome elements found");
        }

        sc.close();
    }
}
