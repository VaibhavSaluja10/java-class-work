// Write a Java program where:
// A Car has an Engine
// Engine has attributes like engineType and horsePower
// Display car and engine details
// --> Demonstrate composition


package hasARelationship;

public class Car {
    private String carModel;
    private String carBrand;
    private Engine engine;

    public Car(String carModel, String carBrand, Engine engine) {
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Engine Type: " + engine.getEngineType());
        System.out.println("Horse Power: " + engine.getHorsePower());
    }







}
