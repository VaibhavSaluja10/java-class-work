package polymorphism;

public class MainAppGame9 {
    public static void main(String[] args) {

        Character c1 = new Warrior();
        Character c2 = new Archer();
        Character c3 = new Mage();

        c1.attack();
        c2.attack();
        c3.attack();
    }
}
