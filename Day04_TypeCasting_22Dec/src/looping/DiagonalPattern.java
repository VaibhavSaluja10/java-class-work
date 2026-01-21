package looping;

public class DiagonalPattern {
	public static void main(String[] args) {
		int num = 3;
//		for(int i =1;i<=num;i++) {
//			for(int j=1;j<=num;j++) {
//				if(i==j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		for(int i =1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if((i+j==5) || (i==j)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
