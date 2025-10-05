package Worldwanderer;

/**
 * Handles the user interface and communication with SearchController.
 * 
 * Responsible for prompting the user, showing messages,
 * and displaying search results or error notifications.
 */
public class WebAppUI {

    private SearchController controller;

    public WebAppUI() {
        controller = new SearchController();
    }

    /**
     * Prompts the user for destination, travel dates, and guests.
     * Then sends the input to the controller for validation.
     */
    public void promptForDetails() {
        System.out.println("System asks for destination, dates, and number of guests...");
        controller.validateDetails("Melbourne", "2025-12-01", "2025-12-05", 2);
    }

    // --- Display methods (simulating UI screens) ---

    public void displayListOfAccommodations() {
        System.out.println("Displaying list of available accommodations...");
    }

    public void displayComparison() {
        System.out.println("Showing side-by-side comparison of selected accommodations...");
    }

    public void displayNoResults() {
        System.out.println("No results found. Try adjusting filters or dates.");
    }

    public void displayApiError() {
        System.out.println("API error: Unable to fetch results. Please try again later.");
    }
}
