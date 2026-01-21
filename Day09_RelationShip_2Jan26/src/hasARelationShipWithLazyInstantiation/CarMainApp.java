package hasARelationShipWithLazyInstantiation;

public class CarMainApp {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("CEAT"));
		c.addTyre(new Tyre("MRF2"));
		c.addTyre(new Tyre("MRF3"));
		
		for (int i=0;i<c.tyres.length;i++) {
			System.out.println(c.tyres[i].getBrand());
		}
	}

}
