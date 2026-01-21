package encapsulation;

public class TestAtmPin {
	public static void main(String[] args) {

		
		AtmPin ap = new AtmPin();
		AtmPin ap1 = new AtmPin(1234);
		System.out.println("Your Pin: "+ap.getPin());
		System.out.println("Your Pin: "+ap1.getPin());
	}

}
