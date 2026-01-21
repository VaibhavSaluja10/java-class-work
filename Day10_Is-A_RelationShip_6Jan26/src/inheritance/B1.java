package inheritance;

//Child Class
public class B1 extends A1 {
 public static void main(String[] args) {

     B obj = new B();     // object creation is REQUIRED

     System.out.println(obj.a); // access non-static variable
     obj.m1();                  // call non-static method
 }
}
