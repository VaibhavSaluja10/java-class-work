package hasARelationship;

public class MainAppPersonPassport {
    public static void main(String[] args) {
        Passport passport = new Passport("A1234567", "USA");
        Person person = new Person("Vaibhav", passport);

        System.out.println("Name: " + person.getName());
        System.out.println("Passport Number: " + passport.getPassportNumber());
        System.out.println("Nationality: " + passport.getNationality());
    }

}
