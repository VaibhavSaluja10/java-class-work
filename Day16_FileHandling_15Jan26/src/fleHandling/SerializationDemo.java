package fleHandling;

import java.io.*;

// Main class
public class SerializationDemo {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("Vaibhav", 1);

            // File object (must include file name)
            File file = new File("D://student.txt");

            // -------- Serialization --------
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(s1);
            out.close();

            // -------- Deserialization --------
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fis);
            Student s = (Student) in.readObject();
            in.close();

            System.out.println(s.name);
            System.out.println(s.id);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Student class must implement Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;

    Student() {
    	
    }

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
