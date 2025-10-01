package hotelReservationSystem;

import java.time.LocalDateTime;

public class MainClass {

	public static void main(String[] args) {
		
		//default rooms
		Room room1 = new Room(1, RoomType.SINGLE,1000);
		Room room2 = new Room(1, RoomType.DOUBLE,2000);
		Room room3 = new Room(1, RoomType.SUITE,3000);
		
		
		
		//for now only one hotel 
		Hotel hotel  = new Hotel(1, "Tanduri");
		hotel.room.add(room1);
		hotel.room.add(room2);
		hotel.room.add(room3);
		
		User user = new User(1, "Nirbhay", "nirbhay@gmail.com");
		
		
		Room chooseRoom = hotel.room.get(1);
		
		Reservation booking = ReservationFactory.createReservation(user, hotel, chooseRoom, LocalDateTime.of(2025, 10, 1, 11, 0),
				LocalDateTime.of(2025, 10, 3, 12, 0), new CreditCardPayment());
		
		System.out.println("Reservation " + booking.reservationId + " confirmed for " +
                booking.user.userName + " at " + booking.hotel.hotelName +
                ", Room: " + booking.room.type +
                ", Total: Rs." + booking.totalAmount);

		
		
	}
}
