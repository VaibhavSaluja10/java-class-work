package inheritance;

public class Student {
    int rollNo;
    int marks;
    Person person;

    public Student(String name, int age, int rollNo, int marks) {
        this.person = new Person(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

}
