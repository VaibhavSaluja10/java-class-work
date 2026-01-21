package oops;

public class OuterExample {
	public static void main(String[] args) {
//		Outer.Inner.display();
		// for no static access we create object .
		
//		Outer.Inner e1 = new Outer.Inner();
//		e1.test();
		
		Outer o = new Outer();
		o.test();
	}

}
 