package Worldwanderer;

/**
 * Represents an accommodation record in the system.
 * 
 * This class may support data representation for real API results.
 */
public class Accommodation {
    private int id;
    private String name;
    private String location;
    private double price;
    private double rating;
    private boolean available;

    public Accommodation(int id, String name, String location, double price, double rating, boolean available) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.rating = rating;
        this.available = available;
    }

    /**
     * Returns accommodation details formatted for display.
     */
    public String getDetails() {
        return name + " in " + location + " | $" + price + " | Rating: " + rating;
    }

    public boolean isAvailable() {
        return available;
    }
}
