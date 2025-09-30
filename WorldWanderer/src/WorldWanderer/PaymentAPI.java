package WorldWanderer;

//External Service
public class PaymentAPI {
	public boolean requestPayment() {
		System.out.println("Validating Payment...");
		
		//randomly approve or reject
		boolean approved = Math.random() > 0.5;
		return approved;
	}

}
