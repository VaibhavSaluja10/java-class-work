package oops;

public class EncapsulationApp {
	public static void main(String[] args) {
		Encapsulation p1 = new Encapsulation();
//		System.out.println(p1.price);			// cannot access
		p1.setPrice(100);
		p1.setPrice(200);
		p1.setPrice(-200);
		System.out.println(p1.getPrice());
	}

}
