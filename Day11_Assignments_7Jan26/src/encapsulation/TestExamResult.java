package encapsulation;

public class TestExamResult {
    public static void main(String[] args) {
        ExamResult examResult = new ExamResult();
        
        // Calculate result based on marks
        examResult.calculateResult(75);
        
        // Display the result
        System.out.println("Exam Result: " + examResult.getResult());
    }

}
