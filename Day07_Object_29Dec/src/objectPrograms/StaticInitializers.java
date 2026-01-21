package objectPrograms;

public class StaticInitializers {
	static {
		System.out.println("Hii from Static Block"); //1st (TOP to BOTTOM)
	}
	public static void main(String[] args) {
		System.out.println("Hello from Main Method"); //3rd
	}
	
	static {
		System.out.println("Hii from 2nd Static Block"); //2nd
	}

}
