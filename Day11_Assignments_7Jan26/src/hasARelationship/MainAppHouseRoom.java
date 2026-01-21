package hasARelationship;

public class MainAppHouseRoom {
    public static void main(String[] args) {
        Room room = new Room("Bedroom", 250.0);
        House house = new House("123 Main St", new Room[]{room});
        house.showHouseDetails();
    }

}
