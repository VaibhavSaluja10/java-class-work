package operators;

public class PositiveNegative {
	public static void main(String[] args) {
        int number = -5; 
        String result = (number >= 0) ? "Positive" : "Negative";
        System.out.println("The number " + number + " is " + result);
    }

}
