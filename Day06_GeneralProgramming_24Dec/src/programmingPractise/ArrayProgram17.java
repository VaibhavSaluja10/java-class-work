package programmingPractise;

import java.util.Scanner;

public class ArrayProgram17 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        // Check palindrome
        for (int i = 0; i < size / 2; i++) {
            if (array[i] != array[size - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is NOT Palindrome");
        }

        sc.close();
    }
}
