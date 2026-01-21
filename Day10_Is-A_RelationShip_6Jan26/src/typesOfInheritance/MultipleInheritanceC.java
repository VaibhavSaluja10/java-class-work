package typesOfInheritance;

public class MultipleInheritanceC implements MultipleInheritanceA, MultipleInheritanceB {
	public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public static void main(String[] args) {
    	MultipleInheritanceC m = new MultipleInheritanceC();
        m.print();
        m.scan();
    }

}
