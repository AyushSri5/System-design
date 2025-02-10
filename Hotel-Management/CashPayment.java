public class CashPayment implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Cash Payment");
    }
}
