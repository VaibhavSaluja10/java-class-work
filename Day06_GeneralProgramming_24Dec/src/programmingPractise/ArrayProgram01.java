package programmingPractise;

import java.util.Scanner;

public class ArrayProgram01 {
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

        System.out.println("Elements divisible by 5:");

        // Print elements divisible by 5
        for (int i = 0; i < size; i++) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}
