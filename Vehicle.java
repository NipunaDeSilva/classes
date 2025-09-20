//Author = Nipuna Samaraweera Arachchige(S4075255)

public class Vehicle{
    private int vehicleId;
    private String type;
    private String model;
    private double price;
    private boolean isAvailable;

    public boolean checkAvailability() {
        return isAvailable;
    }
    public String getDetails() {
        return "vehicleId: " + vehicleId + ", type: " + type + ", model: " + model + "\n";
    }
}