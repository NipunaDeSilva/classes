public class Main {
    public static void main(String[] args) {
        GuestUser guest = new GuestUser();
        System.out.println("Guest user registering...");
        guest.register();

        RegisteredUser user = new RegisteredUser();
        System.out.println("Registered user logging in...");
        user.login();
        System.out.println("Booking a service...");
        user.bookService();
        System.out.println("Making payment...");
        Payment payment = new Payment();
        user.makePayment();
        payment.processPayment();
        System.out.println("Writing a review...");
        user.writeReviews();
        System.out.println("Contacting support...");
        user.contactSupport();
        System.out.println("Logging out...");
        user.logout();

        SystemAdmin admin = new SystemAdmin();
        System.out.println("Admin logging in...");
        admin.login();
        System.out.println("Managing accounts...");
        admin.manageAccounts();
        admin.logout();

        CustomerSupport support = new CustomerSupport();
        System.out.println("Support logging in...");
        support.login();
        System.out.println("Responding to a query...");
        support.respond("respond");
        support.logout();

        SearchService search = new SearchService();
        System.out.println("Searching flights...");
        search.searchFlights();
        System.out.println("Comparing accommodations...");
        search.compareAccommodation();
        System.out.println("Searching for vehicles...");
        search.searchVehicles("destination", 0);

        Vehicle vehicle = new Vehicle();
        System.out.println("Checking vehicle availability...");
        vehicle.checkAvailability();
        vehicle.getDetails();

        Booking booking = new Booking();
        System.out.println("Confirming booking...");
        booking.confirm();
        System.out.println("Cancelling booking...");
        booking.cancel();
        booking.seeDetails();

        Payment p = new Payment();
        System.out.println("Processing payment...");
        p.processPayment();
    }
}
