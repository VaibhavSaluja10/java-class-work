package hasARelationShipWithEarlyInstantiation;

public class UniversityMainApp {
    public static void main(String[] args) {

        University u = new University("LPU University");

        System.out.println(u.getUniversityName());
        System.out.println(u.getDepartment().getDeptName());
    }
}
