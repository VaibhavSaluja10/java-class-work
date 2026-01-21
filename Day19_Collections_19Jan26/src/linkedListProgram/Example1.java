package linkedListProgram;

import java.util.LinkedList;

public class Example1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("Hello");
		list.add(null);
		
		System.out.println(list);
		
		System.out.println(list.contains(5)); // give true or false if value is present or not.
		System.out.println(list.indexOf(3)); // give index of number , -1 if not present.
		
		for(Object o : list) {
			System.out.print(o+" ");
		}
	}
}
