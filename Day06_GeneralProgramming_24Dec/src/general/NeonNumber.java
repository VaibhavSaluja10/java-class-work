package general;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int sum=0;
        
        
        while(square!=0) {
        	sum = sum+(square%10);
        	square = square/10;
        }
        
        boolean isNeon = (sum==num)?true:false;
        System.out.println("Is it neon Number of not: "+isNeon);
        sc.close();
        
    }
}
