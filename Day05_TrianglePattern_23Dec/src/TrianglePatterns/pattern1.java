package TrianglePatterns;

public class pattern1 {
	public static void main(String[] args) {
//		int n=4;
//		for (int i =1;i<=n;i++){
//			for(int j=1;j<n*2;j++) {
//				if(i+j>=n+1 && j-i<=n-1) {
//					System.out.print("*");
//				}else {
//				System.out.print(" ");
//				
//			}
//			}
//			System.out.println();
//		}
		
		int n=4;
		int a=1;
		for (int i =1;i<=n;i++){
			for(int j=1;j<n*2;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print(a);
					a++;
				}else {
				System.out.print(" ");
				
			}
			}
			a=1;
			System.out.println();
		}
		
	}

}
//
//	  1   
//   123  
//  12345 
//1234567
//
//
