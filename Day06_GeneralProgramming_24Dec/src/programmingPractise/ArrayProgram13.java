package programmingPractise;

import java.util.Scanner;

public class ArrayProgram13 {
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

        int evenSum = 0;
        int oddSum = 0;

        // Calculate even sum and odd sum
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
            }
        }

        int difference = evenSum - oddSum;

        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
        System.out.println("Difference (Even - Odd): " + difference);

        sc.close();
    }
}
