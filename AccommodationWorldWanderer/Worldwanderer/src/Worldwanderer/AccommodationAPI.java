package Worldwanderer;

/**
 * Simulates communication with an external accommodation API.
 * 
 * Returns mock data to imitate real-world API responses.
 */
public class AccommodationAPI {

    /**
     * Fetches accommodation information for a given destination.
     * @param request the city or region requested by the user
     * @return a string representing either a list, an empty response, or an error
     */
    public String callAccommodationAPI(String request) {
        System.out.println("Fetching accommodations for: " + request);

        // Simulated response cases (mock API logic)
        if (request.equals("error")) return "error";
        if (request.isEmpty()) return "";
        return "List of Accommodations";  // default successful response
    }
}
