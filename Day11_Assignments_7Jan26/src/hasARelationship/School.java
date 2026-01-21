//
//Write a Java program where:
//A School has many Teacher objects
//Teacher has name and subject
//Display all teachers of the school



package hasARelationship;

public class School {
    String schoolName;
    Teacher[] teachers;

    public School(String schoolName, Teacher[] teachers) {
        this.schoolName = schoolName;
        this.teachers = teachers;
    }

    public void displayTeachers() {
        System.out.println("Teachers in " + schoolName + ":");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.name + ", Subject: " + teacher.subject);
        }
    }

}
