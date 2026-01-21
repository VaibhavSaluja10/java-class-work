package hasARelationShipWithEarlyInstantiation;

public class CarMainApp {
	public static void main(String[] args) {
		
		Car c = new Car("BMW");
		System.out.println(c.getModelName());
		System.out.println(c.getEngine().getHp());
		
	}

}
