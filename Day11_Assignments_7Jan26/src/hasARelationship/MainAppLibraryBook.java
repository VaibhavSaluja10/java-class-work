package hasARelationship;

public class MainAppLibraryBook {

    public static void main(String[] args) {
        Book book1 = new Book(1, "1984", "George Orwell");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald");

        Book[] books = {book1, book2, book3};
        Library library = new Library("Central Library", books);
        library.displayBooks();
    }

}
