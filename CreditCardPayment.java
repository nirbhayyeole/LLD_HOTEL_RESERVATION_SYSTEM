package hotelReservationSystem;

public class CreditCardPayment  implements PaymentStrategy{

	@Override
	public boolean pay(double amount) {
		System.out.println("Successful Transaction with Amount of "+amount);
		return true;
		
	}

}
