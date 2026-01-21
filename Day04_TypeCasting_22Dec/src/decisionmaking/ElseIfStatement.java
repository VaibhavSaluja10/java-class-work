package decisionmaking;

public class ElseIfStatement {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("A is larger than B");
		}
		else if(a==b) {
			System.out.println("Both are eqaul");
		}
		else {
			System.out.println("B is larger than A");
		}
	}

}
