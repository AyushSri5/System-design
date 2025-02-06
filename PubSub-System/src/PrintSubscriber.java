public class PrintSubscriber implements Subscriber{
    public PrintSubscriber(String subscriber1) {
    }

    @Override
    public void onMessage(Message message) {
        message.print();
    }
}
