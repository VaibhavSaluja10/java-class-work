package hasARelationship;

public class MainAppSchoolTeacher {
    public static void main(String[] args) {
        Teacher[] teachers = {
            new Teacher("Alice Johnson", "Mathematics"),
            new Teacher("Bob Smith", "Science"),
            new Teacher("Catherine Lee", "History")
        };

        School school = new School("Greenwood High", teachers);
        school.displayTeachers();
    }

}
