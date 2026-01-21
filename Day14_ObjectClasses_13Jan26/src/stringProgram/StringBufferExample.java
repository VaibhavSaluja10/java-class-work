package stringProgram;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		
		//append
		s1.append("hii");
		System.out.println(s1);
		
		//insert
		s1.insert(2,"Everyone");
		System.out.println(s1);
		
		//reverse
		s1.reverse();
		System.out.println(s1);
		
		//replace
		s1.replace(2, 5, "Byeeeeeeee"); // 2 is inclusive and 5 is exclusive
		System.out.println(s1);
		
		// delete
		
//		s1.delete(2, 5);
		s1.delete(4,s1.length());
		System.out.println(s1);
		
		//capacity
		System.out.println(s1.capacity());
		// (old capacity * 2) + 2
		
		s1.append("fghjkldxcfghjkldxfghjklgeuifeufgeugcuedgudogcuoewdgcewiogfewuogfuewgfHP");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
	}

}
