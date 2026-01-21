// Write a Java program where:
// speed is private
// methods to increase and decrease speed
// speed cannot exceed a fixed limit



package encapsulation;

public class VehicleSpeedControl {
    private int speed;
    private final int MAX_SPEED = 120;

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int increment) {
        if (speed + increment <= MAX_SPEED) {
            speed += increment;
        } else {
            System.out.println("Cannot exceed maximum speed of " + MAX_SPEED);
        }
    }

    public void decreaseSpeed(int decrement) {
        if (speed - decrement >= 0) {
            speed -= decrement;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

}
