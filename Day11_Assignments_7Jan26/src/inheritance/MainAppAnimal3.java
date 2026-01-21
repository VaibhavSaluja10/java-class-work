package inheritance;

public class MainAppAnimal3 {

    public static void main(String[] args) {

        Dog3 dog = new Dog3();

        dog.eat();   // From Animal
        dog.walk();  // From Mammal
        dog.bark();  // From Dog
    }
}
