package hotelReservationSystem;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ReservationFactory {
	public static int counter=1;

	public static Reservation createReservation(User user, Hotel hotel, Room room, 
			LocalDateTime checkIn, LocalDateTime checkOut, PaymentStrategy paymentStrategy) {
				
		
		if(!room.isAvailable) {
			throw new RuntimeException("No Room Available");
		}
		
		long days = ChronoUnit.DAYS.between(checkIn, checkOut);
		if(days<=0) {
			throw new RuntimeException("checkOut date must be after checkIn date");
		}
		
		double totalAmount = room.price*days;
		boolean isBookedSuccessful = paymentStrategy.pay(totalAmount);
		if(isBookedSuccessful) {
			room.isAvailable=false;
		}else {
			throw new RuntimeException("Transaction Failed");
		}
		
		
		Reservation reservation  = new Reservation();
		reservation.reservationId = counter++;
		reservation.user = user;
		reservation.hotel=hotel;
		reservation.room=room;
		reservation.checkIn=checkIn;
		reservation.checkOut= checkOut;
		reservation.status=ReservationStatus.CONFIRMED;
		reservation.totalAmount =totalAmount;
		
		return reservation;
		
	}
}
