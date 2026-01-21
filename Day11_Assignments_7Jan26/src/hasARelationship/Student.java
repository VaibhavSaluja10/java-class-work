// Write

// a Java program where:
// A Student has an Address
// Address contains city, state, and pincode
// Print complete student details



package hasARelationship;

public class Student {
    private int studentId;
    private String name;
    private Address address;

    public Student(int studentId, String name, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

}
