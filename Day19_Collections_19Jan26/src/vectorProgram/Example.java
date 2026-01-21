package vectorProgram;

import java.util.Vector;

public class Example {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.addElement(20);
		v.add(30);
		v.add(40);
		v.add(40);
		v.add("Hello");
		v.add(null);
		System.out.println(v);
	}

}
