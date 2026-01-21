package objectPrograms;

public class BookApp {
	public static void main(String[] args) {
		Book b1 = new Book("c++",300);
		Book b2 = new Book("Csharp",500);
		Book b3 = new Book("Python",493);
		
//		b1.title = "Java";
//		b1.price = 2000;
//		
//		b2.title = "Python";
//		b2.price = 1000;
//		
//		
//		b3.title = "SQL";
//		b3.price= 500;
		
		//Access
		System.out.println(b1.title);
		System.out.println(b3.price);
	}

}
