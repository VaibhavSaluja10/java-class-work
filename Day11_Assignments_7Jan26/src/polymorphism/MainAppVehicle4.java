package polymorphism;

public class MainAppVehicle4 {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        System.out.println("Car Rent: " + v1.calculateRent(3));
        System.out.println("Bike Rent: " + v2.calculateRent(3));
        System.out.println("Truck Rent: " + v3.calculateRent(3));
    }
}
