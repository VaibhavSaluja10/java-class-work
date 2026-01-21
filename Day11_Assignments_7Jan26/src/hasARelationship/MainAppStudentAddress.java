package hasARelationship;

public class MainAppStudentAddress {
    public static void main(String[] args) {
        Address address = new Address("New York", "NY", "10001");
        Student student = new Student(101, "Alice", address);

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Address: " + student.getAddress().getCity() + ", " +
                           student.getAddress().getState() + " - " +
                           student.getAddress().getPincode());
    }

}
