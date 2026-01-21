package operators;

public class DivisibleByThreeAndFive {

    public static void main(String[] args) {
        int number = 15;

        String result =
                (number % 3 == 0 && number % 5 == 0) ? "Divisible by both 3 and 5" :
                (number % 5 == 0) ? "Divisible by only 5" :
                (number % 3 == 0) ? "Divisible by only 3" :
                "Divisible by neither 3 nor 5";

        System.out.println(result);
    }
}