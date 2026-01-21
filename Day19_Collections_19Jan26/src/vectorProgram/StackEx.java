package vectorProgram;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack s = new Stack(); // LIFO
		s.push(10);
		s.push(50);
		s.push(40);
		s.push(30);
		s.push(20);
		s.push("Hello");
		s.push(null);
		
		System.out.println(s);
		
		//peek()
		System.out.println(s.peek()); // last element show only
		
		//pop
		s.pop();
		System.out.println(s); // last element delete
		
		
		
	}

}
