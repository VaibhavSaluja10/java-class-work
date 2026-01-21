package codingSimple;

public class PalindromeNumberNegative {
	public static void main(String[] args) {
		int num = 121;
		
		if(num<0) {
			System.out.println("Not Palindrome"); 
			return;
		}
		
		int original = num;
		int rev=0;
		
		while(num>0) {
			int last=num%10;
			rev = 10 * rev + last;
			num/=10;
		}
		
		if(rev==original) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}

}
