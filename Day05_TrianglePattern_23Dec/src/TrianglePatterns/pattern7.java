package TrianglePatterns;

public class pattern7 {
    public static void main(String[] args) {
        int n = 4;
        int sz = n * 2 - 1;

        for (int i = 1; i <= sz; i++) {
            for (int j = 1; j <= sz; j++) {

                if (i == 1 || i == sz || j == 1 || j == sz || i + j == n + 1 ||  
                	j - i == n - 1 ||                                                       
                    i - j == n - 1 ||                                 
                    i + j == 3 * n - 1) {                             

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
