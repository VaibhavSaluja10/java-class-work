package typesOfInheritance;

class SingleInheritanceB extends SingleInheritanceA{

    public static void main(String[] args) {

    	SingleInheritanceB obj = new SingleInheritanceB();     // object of child class

        System.out.println(obj.a); // access parent variable
        obj.m1();                  // access parent method
    }
}
