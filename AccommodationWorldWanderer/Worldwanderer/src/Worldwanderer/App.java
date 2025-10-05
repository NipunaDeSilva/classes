package Worldwanderer;
/**
 * Entry point of the WorldWanderer system.
 * Simulates the "Search & Compare Accommodation" use case flow.
 * 
 * This class represents the main program that initializes a RegisteredUser
 * and starts the accommodation search process via WebAppUI.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== Search & Compare Accommodation Simulation ===");

        // Create a sample registered user and start the search process
        RegisteredUser user = new RegisteredUser("Rashad", "rashad@example.com");
        WebAppUI ui = new WebAppUI();
        user.startSearch(ui);
    }
}
