package operators;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a = 5;
		int b = a++ + ++a + a;
		int c = --a + ++b + b--;
		int d = a + b + c + a--;
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
	}

}
