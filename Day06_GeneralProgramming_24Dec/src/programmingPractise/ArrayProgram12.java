package programmingPractise;

import java.util.Scanner;

public class ArrayProgram12 {
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
        int count = 0;

        // Calculate sum and count of even elements
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of even elements: " + average);
        } else {
            System.out.println("No even elements in the array");
        }

        sc.close();
    }
}
