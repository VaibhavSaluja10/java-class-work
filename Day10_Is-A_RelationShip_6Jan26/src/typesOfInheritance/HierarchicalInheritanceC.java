package typesOfInheritance;


// Employee
public class HierarchicalInheritanceC extends HierarchicalInheritanceA{
	
	public static void main(String[] args) {
		HierarchicalInheritanceC obj = new HierarchicalInheritanceC();
		
		obj.displayName();   // inherited from Person
        obj.work();          // own method
    }

    void work() {
        System.out.println(name+" works");
    }
		

}
