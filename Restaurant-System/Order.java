import java.util.Date;
import java.util.List;

public class Order {
    private String id;
    private List<MenuItem> menuItems;
    private double totalAmount;
    private OrderStatus orderStatus;
    private Date timeStamp;

    public void makeOrder(){
        // Logic for making the order
    }
}
