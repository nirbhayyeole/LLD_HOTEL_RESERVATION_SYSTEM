# LLD_HOTEL_RESERVATION_SYSTEM



Here# 🏨 Hotel Reservation System (LLD + Java Implementation)

This project is a **Low-Level Design (LLD)** implementation of a **Hotel Reservation System** in Java.  
It demonstrates the use of **Factory Pattern** (for reservation creation) and **Strategy Pattern** (for payment processing).

---

## ✨ Features
- Create hotels with multiple rooms.
- Support for different **room types**: `SINGLE`, `DOUBLE`, `SUITE`.
- Customers can book rooms for specific check-in and check-out dates.
- Prevents **double booking** of rooms.
- Support for **multiple payment methods** using Strategy Pattern:
  - Credit Card
  - UPI
- Cancel reservation → frees up the room.
- Simple demo in `main()` to simulate the flow.

---

## 🏗️ Design
### Entities
- **User** → customer information (id, name, email).  
- **Hotel** → hotel details, contains rooms.  
- **Room** → room details (id, type, price, availability).  
- **Reservation** → booking details (user, hotel, room, dates, status).  

### Enums
- `RoomType` → SINGLE, DOUBLE, SUITE  
- `ReservationStatus` → CONFIRMED, CANCELLED  

### Patterns Used
- **Factory Pattern** → `ReservationFactory` handles centralized reservation creation.  
- **Strategy Pattern** → `PaymentStrategy` interface with implementations:  
  - `CreditCardPayment`  
  - `UpiPayment`  

---

## 🛠️ Tech Stack
- Java 17+  
- Core Java Collections, OOP, Enums  
- No external frameworks required  

---


