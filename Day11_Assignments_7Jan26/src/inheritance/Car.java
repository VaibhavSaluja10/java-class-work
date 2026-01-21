package inheritance;

public class Car {
	public String brand;
	Vehicle v;
	
	public Car(int Speed,String fuelType,String brand) {
		this.v = new Vehicle(120,"Petrol");
		this.brand=brand;
	}

}
