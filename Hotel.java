package hotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	int hotelId;
	String hotelName;
	List<Room> room = new ArrayList<>();
	public Hotel(int hotelId, String hotelName) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}
	
	
}
