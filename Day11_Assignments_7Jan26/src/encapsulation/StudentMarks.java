// Write
// a Java program where:
// marks is a private variable
// provide methods to set and get marks
// do not allow marks greater than 100


package encapsulation;

public class StudentMarks {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }

}
