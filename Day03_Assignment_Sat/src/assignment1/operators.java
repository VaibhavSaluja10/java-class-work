package assignment1;

public class operators {
    public static void main(String[] args) {

        int marks = 41;
        int att = 91;

        boolean result = (marks >= 40 && att > 75) ? true : false;
        marks += result ? 5 : 0;

        System.out.println(result);
        System.out.println("Updated Marks: " + marks);
    }
}
