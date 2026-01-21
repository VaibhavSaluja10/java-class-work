//Create a Book class where:
//price is private
//provide methods to update and display price
//price cannot be negative

package encapsulation;

public class LibraryBook {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void displayPrice() {
        System.out.println("Book Price: " + price);
    }
}
