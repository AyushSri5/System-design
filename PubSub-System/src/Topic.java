import java.util.List;

public class Topic {
    List<Subscriber> list;
    private String name;

    public Topic(String topic1) {
    }

    public String getName() {
        return name;
    }

    public void addSubscriber(Subscriber subscriber){
        list.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        list.remove(subscriber);
    }
    public void publishMessage(Message message){
        for(Subscriber subscriber:list){
            subscriber.onMessage(message);
        }
    }
}
