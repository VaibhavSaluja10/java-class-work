package hasARelationShipWithEarlyInstantiation;

public class Department {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // Constructors
    Department() {
    }

    Department(String deptName) {
        this.deptName = deptName;
    }
}
