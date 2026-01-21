package inheritance;

public class MainAppCalculator9 {

    public static void main(String[] args) {

        AdvancedCalculator9 calc = new AdvancedCalculator9();

        System.out.println("Addition: " + calc.add(10, 5));       // Reused method
        System.out.println("Multiplication: " + calc.multiply(4, 6));
    }
}
