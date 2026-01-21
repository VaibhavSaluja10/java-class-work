package programmingPractise;

import java.util.Scanner;

public class ArrayProgram19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int index = sc.nextInt();
        int value = sc.nextInt();

        for (int i = n; i > index; i--)
            arr[i] = arr[i - 1];

        arr[index] = value;

        for (int i = 0; i <= n; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}
