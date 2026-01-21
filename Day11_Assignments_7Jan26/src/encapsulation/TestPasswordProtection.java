package encapsulation;

public class TestPasswordProtection {
    public static void main(String[] args) {
        PasswordProtection passwordProtection = new PasswordProtection();
        
        // Attempt to set a weak password
        passwordProtection.setPassword("123"); 
        
        // Set a strong password
        passwordProtection.setPassword("StrongPass123");
        
        // Display the password
        System.out.println("Password: " + passwordProtection.getPassword()); 
    }

}
