package Worldwanderer;


/**
 * Represents a registered traveller who can search and compare accommodations.
 * 
 * This actor triggers the main use case and interacts with the WebAppUI.
 */
public class RegisteredUser {
    private String name;
    private String email;

    public RegisteredUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Initiates the search process.
     * @param ui the WebAppUI that handles system interaction
     */
    public void startSearch(WebAppUI ui) {
        System.out.println(name + " chooses 'Search Accommodation'.");
        ui.promptForDetails();
    }
}
