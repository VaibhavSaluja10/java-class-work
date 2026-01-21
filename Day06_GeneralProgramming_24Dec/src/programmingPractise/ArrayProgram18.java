package programmingPractise;

import java.util.Scanner;

public class ArrayProgram18 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }

        // Copy elements from array1 to array2
        for (int i = 0; i < size; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of second array:");

        for (int i = 0; i < size; i++) {
            System.out.print(array2[i] + " ");
        }

        sc.close();
    }
}
