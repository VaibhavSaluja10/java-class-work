package codingSimple;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 1210;
		int original = num;
		int rev = 0;
		
		while(num>0) {
			int last = num%10;
			rev = 10* rev + last;
			num/=10;
			
		}
		
		if(rev == original) {
			System.out.println("It is palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
	}

}
