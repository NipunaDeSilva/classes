package Worldwanderer;

/**
 * Handles comparison between multiple accommodations.
 * 
 * This represents the final step of the use case where the user views
 * a side-by-side comparison of two selected accommodations.
 */
public class ComparisonService {

    /**
     * Compares two accommodation options and outputs results.
     * @param acc1 first accommodation name
     * @param acc2 second accommodation name
     */
    public void compareAccommodations(String acc1, String acc2) {
        System.out.println("Comparing " + acc1 + " and " + acc2 + "...");
        System.out.println("Comparison complete: " + acc1 + " vs " + acc2);
    }
}
