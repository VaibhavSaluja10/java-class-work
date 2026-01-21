package objectPrograms;

public class NonStaticInitializers {
	 {
		System.out.println("Hii from Non Static Block"); //1st (TOP to BOTTOM) // Not execute until and unless object create
	}
	 NonStaticInitializers(){
		 System.out.println("Hii from Constructor Block"); //3rd
	 }
	public static void main(String[] args) {
		NonStaticInitializers d1 = new NonStaticInitializers();
	}
	
	
	
	 {
		System.out.println("Hii from 2nd Non Static Block"); //2nd
	}

}
