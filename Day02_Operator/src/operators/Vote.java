package operators;

public class Vote {
	public static void main(String[] args) {
        int age = 18; 
        String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println("At age " + age + ", you are " + result);
    }

}
