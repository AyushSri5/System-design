import java.sql.Time;
import java.util.List;

public class AuctionListing {
    private String id;
    private String itemName;
    private String description;
    private double startingPrice;
    private Time duration;
    private User seller;
    private Bid currentBid;
    private List<Bid> bids;

    public void startBidding(){
        // Logic for starting the auction
    }
}
