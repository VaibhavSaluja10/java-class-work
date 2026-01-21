package assignment1;

public class user {
    public static void main(String[] args) {

        String username = "admin";
        String password = "1234";

        String inputUser = "admin";
        String inputPass = "wrong";

        boolean locked = false;
        int attempts = 2;
        int maxAttempts = 3;

        boolean success = (username.equals(inputUser) && password.equals(inputPass) && !locked);

        attempts += success ? 0 : 1;
        locked = attempts >= maxAttempts ? true : locked;

        System.out.println("Login Success: " + success);
        System.out.println("Login Attempts: " + attempts);
        System.out.println("Account Locked: " + locked);
    }
}
