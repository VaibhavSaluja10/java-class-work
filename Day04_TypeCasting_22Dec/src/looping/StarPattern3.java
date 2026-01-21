package looping;

public class StarPattern3 {
	public static void main(String[] a) {
		int num=4;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==num || j==num){
					System.out.print("*");
				}
				else {
						System.out.print(" ");
					}
			}
				System.out.println();
			}
			
		}
// Output
//
//	   *
//	   *
//	   *
//	****
		
	}



