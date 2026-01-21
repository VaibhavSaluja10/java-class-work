
//Write a Java program where:
//A House has multiple Room objects
//Room has roomType and area
//Print house and room details
//--> Demonstrate composition


package hasARelationship;

public class House {
    private Room[] rooms;
    private String address;

    public House(String address, Room[] rooms) {
        this.address = address;
        this.rooms = rooms;
    }

    public void showHouseDetails() {
        System.out.println("House Address: " + address);
        
        for (Room room : rooms) {
            System.out.println("Rooms: "+ "- " + room.getRoomType() + ": " + room.getArea() + " sq ft");
        }
    }

}
