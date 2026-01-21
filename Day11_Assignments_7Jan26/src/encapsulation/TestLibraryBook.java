package encapsulation;

public class TestLibraryBook {
    
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        
        // Attempt to set a negative price
        book.setPrice(-50); // Should display a message that price cannot be negative
        
        // Set a valid price
        book.setPrice(150);
        
        // Display the price
        book.displayPrice(); // Should display: Book Price: 150
    }


}
