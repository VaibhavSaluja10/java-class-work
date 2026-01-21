package programmingPractise;

import java.util.Scanner;

public class ArrayProgram07 {
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

        // Print first and last element
        System.out.println("First element: " + array[0]);
        System.out.println("Last element: " + array[size - 1]);

        sc.close();
    }
}
