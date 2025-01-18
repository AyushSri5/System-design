import java.sql.Time;
import java.util.List;

public class TrafficLight {
    private int id;
    private Signal signal;
    private List<Time> durations;

    public void setSignal(Signal signal) {
        this.signal = signal;
    }
    public void notify(Road road){

    }
}
