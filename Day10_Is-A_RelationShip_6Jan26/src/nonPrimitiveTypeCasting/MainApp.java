package nonPrimitiveTypeCasting;

public class MainApp {
    public static void main(String[] args) {

        // Upcasting
        A a = new D();

        // Downcasting checks
        System.out.println(a instanceof A); // true
        System.out.println(a instanceof C); // true
        System.out.println(a instanceof D); // true
        System.out.println(a instanceof B); // false

        if (a instanceof B) {
            B b = (B)a;
        } else {
            System.out.println("Dont have instance of this");
        }
    }
}

