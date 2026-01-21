package operators;

public class MultipleOfTen {
	public static void main(String[] args) {
        int number = 50; 
        String result = (number % 10 == 0) ? "is a multiple of 10" : "is not a multiple of 10";
        System.out.println("The number " + number + " " + result);
    }

}
