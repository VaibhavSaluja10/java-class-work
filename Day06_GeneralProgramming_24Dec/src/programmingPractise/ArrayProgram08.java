package programmingPractise;

import java.util.Scanner;

public class ArrayProgram08 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the numbers for array:");

        // Input array elements
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;

        // Calculate sum of elements
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }

        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}
