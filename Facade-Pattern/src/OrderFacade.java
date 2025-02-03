public class OrderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade(){
        productDao=new ProductDao();
        invoice=new Invoice();
        payment=new Payment();
        sendNotification=new SendNotification();
    }

    public void createOrder(){
        Product product= productDao.getProduct(1);
        invoice.generateInvoice();
        payment.makePayment();
        sendNotification.sendNotification();
    }
}
