package exception1;

public class Example2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			System.out.println("Caught");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
