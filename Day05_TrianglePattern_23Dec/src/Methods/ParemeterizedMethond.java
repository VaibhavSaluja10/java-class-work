package Methods;

public class ParemeterizedMethond {
//	public static int main(String[] args) {
//		int a = 10;
//		return a;
//		return;			It is valid in main statement
//		System.out.println(a);	IT wont get execute as it is written after "return" statement
//	}					Why it not run??
	
	public static void main(String[] args) {
		System.out.println(add(1,2));
	}
	
	public static int add(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		return sum;
		// System.out.println(sum);  // why it cause error find??
	}

}
