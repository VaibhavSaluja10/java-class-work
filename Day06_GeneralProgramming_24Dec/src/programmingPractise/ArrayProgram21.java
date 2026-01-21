package programmingPractise;

import java.util.Scanner;

public class ArrayProgram21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];
        int[] c = new int[n1 + n2];

        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int k = 0;
        for (int i = 0; i < n1; i++) c[k++] = a[i];
        for (int i = 0; i < n2; i++) c[k++] = b[i];

        for (int i : c) System.out.print(i + " ");
        sc.close();
    }
    
}
