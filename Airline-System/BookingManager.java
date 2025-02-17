import java.util.List;

public class BookingManager {
    private List<Booking> bookingList;

    private static BookingManager instance;
    private BookingManager(){

    }

    public BookingManager getInstance(){
        if (instance==null){
            synchronized (BookingManager.class){
                if(instance==null){
                    instance=new BookingManager();
                    return instance;
                }
            }
        }
        return instance;
    }
}
