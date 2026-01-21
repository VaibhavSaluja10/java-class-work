package mapPrograms;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap map= new HashMap();
		map.put(1,"Vaibhav");
		map.put(3,"Sahil");
		map.put(2,"Rohit");
		map.put(5,"Sourabh");
		map.put(77,"Rajat");
		map.put(1,"Aman");
		map.put(16,"Dev");
		map.put(32,"Vaibhav");
		map.putIfAbsent(33, null);
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(Object o : map.entrySet()) {
			System.out.print(o+" ");
		}
		
		System.out.println();
		
		for(Object o : map.keySet()) {
			System.out.print(o+" ");
		}
		
	}

}
