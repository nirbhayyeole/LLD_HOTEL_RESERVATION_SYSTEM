package hotelReservationSystem;

public class Room {

	int roomeId;
	RoomType type;
	boolean isAvailable;
	double price;
	public Room(int roomeId, RoomType type, double price) {
		super();
		this.roomeId = roomeId;
		this.type = type;
		this.isAvailable = true;
		this.price = price;
	}
	
	
}
