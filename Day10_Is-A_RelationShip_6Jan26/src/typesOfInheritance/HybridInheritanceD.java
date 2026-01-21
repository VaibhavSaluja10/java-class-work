package typesOfInheritance;


public class HybridInheritanceD extends HybridInheritanceA implements HybridInheritanceB, HybridInheritanceC {

    public void display() {
        System.out.println("Interface B method");
    }

    public void print() {
        System.out.println("Interface C method");
    }

    public static void main(String[] args) {
    	HybridInheritanceD obj = new HybridInheritanceD();
        obj.show();     // from class A
        obj.display();  // from interface B
        obj.print();    // from interface C
    }
}
