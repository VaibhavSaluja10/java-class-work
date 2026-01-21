package hasARelationship;

public class MainAppCarEngine {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 450);
        Car car = new Car("Mustang", "Ford", engine);
        car.displayDetails();
    }

}
