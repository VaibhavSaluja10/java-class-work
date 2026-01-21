package oops;

public class DemoBoxApp {
	public static void main(String[] args) {
		DemoBox db = DemoBox.createBox();
		System.out.println(db);
		
		DemoBox db2 = DemoBox.createBox(2);
		System.out.println(db2);
	}

}
