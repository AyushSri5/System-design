import java.sql.Timestamp;
import java.util.Map;

public class Show {
    private String id;
    private Movie movie;
    private Theater theater;
    private Timestamp startTime;
    private Timestamp endTime;
    private Map<Seat,User> seats;
}
