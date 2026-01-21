package hasARelationShipWithEarlyInstantiation;

public class University {

    private String universityName;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    // Constructors
    University() {
    }

    University(String universityName) {
        this.universityName = universityName;
    }

    // HAS-A relationship
    private Department dept = new Department("Computer Science");

    public Department getDepartment() {
        return dept;
    }
}
