package stringProgram;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase()); // one more object create hogi, purani par kuch bhi asar nhi hoga
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("H"));
		
		System.out.println(s1.endsWith("w"));
		
//		System.out.println(s1.charAt(6)); // index out of range
		
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		int[] i2 = {1,2,3};
		System.out.println(i2);
		
		String s2 = "Hello Hii Byee";
		System.out.println(s2.split(" ")); // Memory address
		
		String[] str = s2.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		String x = "Hiiii";
		System.out.println(x.concat("Everyone"));
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2,4)); // here index from 2 to 3 only // last is exclusive
	}

}
