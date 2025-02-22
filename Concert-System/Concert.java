import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Concert {
    private String id;
    private String artist;
    private String venue;
    private Date date;
    private Timestamp timestamp;
    private List<Seat> seats;
}
