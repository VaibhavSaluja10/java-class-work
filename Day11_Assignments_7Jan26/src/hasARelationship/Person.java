//
//Write a Java program where:
//A Person has a Passport
//Passport contains passportNumber and nationality
//Display person and passport information
//
package hasARelationship;

public class Person {

    private String name;
    private Passport passport;

    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void showPersonDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Passport Number: " + passport.getPassportNumber());
        System.out.println("Nationality: " + passport.getNationality());

    }
}
