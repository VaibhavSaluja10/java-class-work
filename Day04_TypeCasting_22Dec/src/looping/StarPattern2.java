package looping;

public class StarPattern2 {
	public static void main(String[] a) {
		for(int i=5;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				if(j==1 || i==5) {
					System.out.print("*");
			}
			}
			System.out.println();
		}
		// Output
//		
//		*****
//		*
//		*
//		*
//		*
		
	}

}
