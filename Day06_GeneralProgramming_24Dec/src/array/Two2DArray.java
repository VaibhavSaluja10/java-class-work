package array;

import java.util.Scanner;

public class Two2DArray {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of row: ");
        int row = sc.nextInt();

        System.out.print("Enter the size of column: ");
        int column = sc.nextInt();

        int[][] array = new int[row][column];
        

        // Input
        System.out.println("Enter elements:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
      

        // Output
        System.out.println("2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
