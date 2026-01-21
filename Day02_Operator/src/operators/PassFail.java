package operators;

public class PassFail {
	public static void main(String[] args) {
        int marks = 45; 
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("With marks " + marks + ", you " + result);
    }

}
