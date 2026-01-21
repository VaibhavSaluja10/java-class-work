package programmingPractise;

import java.util.Scanner;

public class ArrayProgram02 {
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

        System.out.println("Elements at even index positions:");

        // Print even index elements
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}
