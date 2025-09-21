public class Accommodation {
    private int accommodationId;
    private String name;
    private String location;
    private double price;
    private double rating;
    private boolean availability;

    public Accommodation(int accommodationId, String name, String location, double price, double rating, boolean availability) {
        this.accommodationId = accommodationId;
        this.name = name;
        this.location = location;
        this.price = price;
        this.rating = rating;
        this.availability = availability;
    }

    public boolean checkAvailability() {
        return availability;
    }

    public String getDetails() {
        return name + " in " + location + " | Price: " + price + " | Rating: " + rating;
    }

    public double calculateCost(int days) {
        return price * days;
    }

    public void updateAvailability(boolean status) {
        this.availability = status;
    }
}
//Author = Rashad Razooludheen(S4112596)