//Author = Nipuna Samaraweera Arachchige(S4075255)

public class Booking{
    private int bookingId;
    private String date;
    private String status;

    public String confirm() {
        return "Confirmed";
    }
    public String cancel() {
        return "Cancelled";
    }
    public String seeDetails() {
        return "Booking no.: " + bookingId + ", date: " + date + ", status: " + status;
    }
}