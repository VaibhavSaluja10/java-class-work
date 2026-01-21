package abstraction;

public class MainAppAnimal {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Cat c = new Cat();
		Dog d = new Dog();
		c.sound();
		c.walk();
		
		d.sound();
		d.walk();
		
		a1.sound();
		a1.walk();
		
		a2.sound();
		a2.walk();
	}

}
