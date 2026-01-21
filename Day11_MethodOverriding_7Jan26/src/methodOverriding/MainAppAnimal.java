package methodOverriding;

public class MainAppAnimal {
	public static void main(String[] args) {
//		Dog d1 = new Dog();
//		d1.walk();
//		d1.sound();
		
		// runtime binding
		Animal a1= new Dog();
		a1.walk();
		a1.sound();
		
		Animal a2 = new Cat();
		a2.walk();
		a2.sound();
	}

}
