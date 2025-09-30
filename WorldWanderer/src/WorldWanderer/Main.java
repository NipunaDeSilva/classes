package WorldWanderer;

//Main class

public class Main {
	public static void main(String[] args) {
		 Database db = new Database();
	     PaymentAPI api = new PaymentAPI();
	     BookingController controller = new BookingController(db, api);
	     SystemUI ui = new SystemUI(controller);
	     controller.setUI(ui);

	     RegisteredUser user = new RegisteredUser(ui);
	     user.startBooking();
	}
}
