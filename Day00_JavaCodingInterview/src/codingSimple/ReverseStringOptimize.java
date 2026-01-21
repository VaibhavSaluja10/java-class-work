package codingSimple;

public class ReverseStringOptimize {
	public static String reverse(String s) {
		if(s==null) return null;
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=s.length() - 1; i>=0;i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("I am Vaibhav"));
	}

}

/*
 Rule

Count how many times loops run and cost inside the loop.

For brute force:

Loop runs n times

Inside loop: string concatenation copies previous string → cost grows each time
So total work: 1 + 2 + ... + n = O(n²)

For StringBuilder:

Loop runs n times

Append is constant → n * O(1) = O(n) 
*/
