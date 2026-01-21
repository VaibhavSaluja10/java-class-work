package encapsulation;

public class TestStudentMark{

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();
        student.setMarks(95);
        System.out.println("Student Marks: " + student.getMarks());

        student.setMarks(105); // This should print an error message
        System.out.println("Student Marks: " + student.getMarks());
    }
}
