package Worldwanderer;

/**
 * Coordinates the flow between the WebAppUI, AccommodationAPI, and ComparisonService.
 * 
 * Responsible for validating details, sending API requests, and handling results.
 */
public class SearchController {

    private AccommodationAPI api;
    private ComparisonService comparisonService;

    public SearchController() {
        api = new AccommodationAPI();
        comparisonService = new ComparisonService();
    }

    /**
     * Validates the search details entered by the user.
     * @param location destination name
     * @param checkIn check-in date
     * @param checkOut check-out date
     * @param guests number of guests
     */
    public void validateDetails(String location, String checkIn, String checkOut, int guests) {
        System.out.println("Validating search details...");
        sendSearchRequest(location);
    }

    /**
     * Sends a simulated request to the AccommodationAPI.
     * Handles all three possible responses: success, no results, or error.
     */
    public void sendSearchRequest(String destination) {
        System.out.println("Sending request to AccommodationAPI...");
        String apiResponse = api.callAccommodationAPI(destination);

        WebAppUI ui = new WebAppUI();  // Create UI for result display

        // Decision logic matches the alt/if branches from the sequence diagram
        if (apiResponse.equals("error")) {
            ui.displayApiError();
        } else if (apiResponse.isEmpty()) {
            ui.displayNoResults();
        } else {
            ui.displayListOfAccommodations();
            requestComparison("Accommodation A", "Accommodation B");
        }
    }

    /**
     * Requests a comparison between two accommodations.
     * @param acc1 first accommodation
     * @param acc2 second accommodation
     */
    public void requestComparison(String acc1, String acc2) {
        System.out.println("Requesting comparison between " + acc1 + " and " + acc2 + "...");
        comparisonService.compareAccommodations(acc1, acc2);
    }
}
