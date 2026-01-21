package inheritance;

public class MainAppShape4 {

    public static void main(String[] args) {

        Shape4 shape1 = new Circle4();
        Shape4 shape2 = new Rectangle4();

        shape1.draw();   // Calls Circle4's draw()
        shape2.draw();   // Calls Rectangle4's draw()
    }
}
