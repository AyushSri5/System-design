import java.util.List;

public class Booking {
    private String id;
    private User user;
    private Concert concert;
    private List<Seat> seats;
    private double totalPrice;
    private BookingStatus bookingStatus;

    public void confirmBooking(){
        // Logic for confirming the booking
    }
    public void cancelBooking(){
        // Logic for cancelling the booking
    }
}
