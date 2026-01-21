package codingSimple;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=1234;
		int revNum = 0;
		while(n>0) {
			int digit=n%10; // take last digit
			revNum = 10*revNum+digit; // add digit to reverse
			n/=10; // remove last digit
			
		}
		System.out.println(revNum);
	}

}

/*Time Complexity:

Loop runs once per digit → O(d) (d = number of digits)

Space Complexity: O(1)

How to find TC:
Each iteration removes one digit (n = n/10) → digits count times.
*/
