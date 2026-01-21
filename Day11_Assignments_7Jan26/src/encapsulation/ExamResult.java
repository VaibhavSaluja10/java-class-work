// Write
// a Java program where:
// result is private
// result is calculated using marks
// users can only view the result



package encapsulation;

public class ExamResult {
    private String result;

    public String getResult() {
        return result;
    }

    public void calculateResult(int marks) {
        if (marks >= 30) {
            this.result = "Pass";
        } else {
            this.result = "Fail";
        }
    }

}
