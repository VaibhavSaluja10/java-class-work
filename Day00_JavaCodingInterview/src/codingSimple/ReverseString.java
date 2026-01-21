package codingSimple;

public class ReverseString {
	public static String reverse(String s){
		if(s==null) return null;
		
		String rev="";
		
		for(int i = s.length() - 1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		
		return rev;
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Vaibhav"));
	}

}
