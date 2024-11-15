import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {

    // Attributes
    private String userID;
    private String name;
    private String email;
    private String password;

    // Constructor
    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters for updating user information
    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    // Method to check login
    public boolean login(String inputEmail, String inputPassword) {
        return this.email.equals(inputEmail) && this.password.equals(inputPassword);
    }

    // Method to display user information
    @Override
    public String toString() {
        return "User ID: " + userID + "\nName: " + name + "\nEmail: " + email;
    }
}

public class Main {
    // List to store users
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initial user for testing
        users.add(new User("Alvinn", "Alvin P Bacit", "alvinbacit12@gmail.com", "alvin"));

        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Login\n2. Create New Account\n3. Forgot Password\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Using traditional switch syntax
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    createNewAccount();
                    break;
                case 3:
                    forgotPassword();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Login method
    private static void login() {
        System.out.print("Enter your email: ");
        String emailInput = scanner.nextLine();

        System.out.print("Enter your password: ");
        String passwordInput = scanner.nextLine();

        // Find user with matching credentials
        for (User user : users) {
            if (user.login(emailInput, passwordInput)) {
                System.out.println("Login successful!");
                System.out.println(user);
                return;
            }
        }
        System.out.println("Login failed. Please check your email and password.");
    }

    // Create New Account method
    private static void createNewAccount() {
        System.out.print("Enter a new User ID: ");
        String userID = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Add new user to the list
        User newUser = new User(userID, name, email, password);
        users.add(newUser);
        System.out.println("Account created successfully!");
    }

    // Forgot Password method
    private static void forgotPassword() {
        System.out.print("Enter your email to reset your password: ");
        String emailInput = scanner.nextLine();

        // Find the user by email
        for (User user : users) {
            if (user.getEmail().equals(emailInput)) {
                System.out.print("Enter your new password: ");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword);
                System.out.println("Password reset successfully!");
                return;
            }
        }
        System.out.println("No account found with that email.");
    }
}
