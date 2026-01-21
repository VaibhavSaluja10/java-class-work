// Write
// a Java program where:
// A Library has multiple Book objects
// Book contains bookId, title, and author
// Display all books in the library
// --> Demonstrate aggregation



package hasARelationship;

public class Library {
    private String libraryName;
    private Book[] books;

    public Library(String libraryName, Book[] books) {
        this.libraryName = libraryName;
        this.books = books;
    }
    public void addBook(Book book) {
    	if (this.books == null) {
    		this.books = new Book[1];
    		this.books[0] = book;
    	} else {
    		Book[] temp = new Book[this.books.length + 1];
    		for (int i = 0; i < this.books.length; i++) {
    			temp[i] = this.books[i];
    		}
    		temp[this.books.length] = book;
    		this.books = temp;
    	}
    }
    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("-----------------------");
        }
    }

}
