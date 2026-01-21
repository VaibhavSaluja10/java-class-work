package setPrograms;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(64);
		set.add(30);
		set.add(20);
		set.add(32);
		set.add(null);
		set.add(16);
		set.add(5);
		System.out.println(set);
		
		System.out.println(set.contains(16)); // true or false
		
		for(Object o : set) {
			System.out.print(o+" ");
		}
	}

}
