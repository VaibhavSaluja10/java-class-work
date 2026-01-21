package hasARelationShipWithEarlyInstantiation;

public class Car2MainApp {
	public static void main(String[] args) {
		Car2 c = new Car2();
		
		for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
	}

}
