package WorldWanderer;

public class RegisteredUser {
	private SystemUI systemUI;
	
	public RegisteredUser(SystemUI ui) {
		this.systemUI = ui;
	}
	
	public void startBooking() {//starts booking process by selecting a service
		systemUI.selectService();
	}

}
