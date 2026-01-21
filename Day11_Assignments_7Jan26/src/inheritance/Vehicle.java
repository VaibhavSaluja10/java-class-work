//
//2. Single Inheritance (Vehicle → Car)
//
//Create a program where:
//Vehicle has speed and fuelType
//Car inherits Vehicle and has brand
//Show car details



package inheritance;

public class Vehicle {
	public int speed;
	public String fuelType;
	
	public Vehicle(int speed,String fuelType) {
		this.speed=speed;
		this.fuelType=fuelType;
		
	}
	
	public void showDetails() {
		System.out.println();
	}

}
