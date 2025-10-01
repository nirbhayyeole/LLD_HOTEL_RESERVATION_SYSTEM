package hotelReservationSystem;

import java.time.LocalDateTime;

public class Reservation {

	int reservationId;
	Hotel hotel;
	User user;
	Room room;
	LocalDateTime checkIn;
	LocalDateTime checkOut;
	ReservationStatus  status;
	double totalAmount;
	
	
}
