package typesOfInheritance;

public class MultiLevelInheritanceC extends MultiLevelInheritanceB{
	public static void main(String[] args) {

		MultiLevelInheritanceC obj = new MultiLevelInheritanceC();   // object of child class

        System.out.println(obj.a); // from class A
        obj.m1();                  // from class A

        System.out.println(obj.b); // from class B
        obj.m2();                  // from class B
    }

}
