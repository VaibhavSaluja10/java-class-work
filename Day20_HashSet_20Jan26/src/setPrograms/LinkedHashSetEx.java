package setPrograms;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(32);
		lhs.add(16);
		lhs.add(4);
		lhs.add(null);
		lhs.add("Hello");
		lhs.add(0);
		lhs.add(null);
		System.out.println(lhs);
		
	}

}
