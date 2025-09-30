package WorldWanderer;

public class BookingController {
	private SystemUI ui;
	private Database database;
    private PaymentAPI paymentAPI;
	
	public BookingController(Database db, PaymentAPI api) {
        this.database = db;
        this.paymentAPI = api;
    }
	
	public void setUI(SystemUI ui) {
		this.ui = ui;
	}
	
	public void requestServiceDetails() {
		String details = database.fetchServiceDetails();
		ui.showServiceDetails(details);
	}
	
	public void sendBookingRequest() {
		boolean validPayment = false;
		boolean cancelled = false;
		
		//loop until the payment is valid or cancelled
		while (!validPayment && !cancelled) {
            validPayment = paymentAPI.requestPayment();

            if (validPayment) {
                // Valid payment branch
                database.saveBooking();
                ui.showConfirmation("Service booked successfully!");
                ui.showInvoice("Invoice details...");
            } else {
                // Invalid payment branch
                ui.showFailureAndRetryOption();

       
                if (cancelled) {
                    ui.showCancelled();
                }
            }
        }
	}

}
