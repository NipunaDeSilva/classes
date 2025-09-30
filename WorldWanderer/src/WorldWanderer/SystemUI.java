package WorldWanderer;
/* UI class interacts with the user*/

public class SystemUI {
	private BookingController bookingController;
	
	public SystemUI(BookingController contrlr) {
		this.bookingController = contrlr;
	}
	
	public void selectService() {
		System.out.println("User selects a service...");
		bookingController.requestServiceDetails();
	}
	
	public void showServiceDetails(String details) {
		System.out.println("Service details: " + details);
		chooseBookingOptions();
	}
	
	public void chooseBookingOptions() {
		System.out.println("User selects booking options...");
		bookingController.sendBookingRequest();
	}
	
	public void showConfirmation(String confirmMessage) {
		System.out.println("Booking confirmed: " + confirmMessage);
	}
	
	public void showInvoice(String invoice) {
		System.out.println("Invoice: " + invoice);
	}
	
	public void showFailureAndRetryOption() {
		System.out.println("Payment failed. Retry or Cancel?");
	}
	
	public void showCancelled() {
		System.out.println("Booking cancelled.");
	}
	

}
