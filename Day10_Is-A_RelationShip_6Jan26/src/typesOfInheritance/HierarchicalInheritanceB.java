package typesOfInheritance;


// Student
public class HierarchicalInheritanceB extends HierarchicalInheritanceA{
	public static void main(String[] args) {

		HierarchicalInheritanceB obj = new HierarchicalInheritanceB();

		obj.displayName();   // inherited from Person
        obj.study();         // own method
    }

   
    void study() {
        System.out.println(name+"studies");
    }


}
