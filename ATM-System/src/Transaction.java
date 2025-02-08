import java.util.Date;

public abstract class Transaction {
    int transaction_id;
    double amount;
    Date timestamp;
    public abstract void perform();
}
