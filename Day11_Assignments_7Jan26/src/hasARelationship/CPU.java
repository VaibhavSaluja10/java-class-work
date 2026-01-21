package hasARelationship;

public class CPU {
    private String brand;
    private double speed; // in GHz

    public CPU(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

}
