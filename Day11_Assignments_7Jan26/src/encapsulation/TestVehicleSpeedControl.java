package encapsulation;

public class TestVehicleSpeedControl {
    public static void main(String[] args) {
        VehicleSpeedControl vehicle = new VehicleSpeedControl();
        // Increase speed
        vehicle.increaseSpeed(50);
        System.out.println("Current Speed: " + vehicle.getSpeed());
        // Try to exceed max speed
        vehicle.increaseSpeed(80); 
        System.out.println("Current Speed: " + vehicle.getSpeed());
        // Decrease speed
        vehicle.decreaseSpeed(30);
        System.out.println("Current Speed: " + vehicle.getSpeed());
        // Try to decrease speed below zero
        vehicle.decreaseSpeed(50); 
        System.out.println("Current Speed: " + vehicle.getSpeed());

        
        
    }

}
