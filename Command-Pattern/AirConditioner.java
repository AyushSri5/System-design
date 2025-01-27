public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc(){
        isOn=true;
        System.out.println("Turn on AC");
    }
    public void turnOffAc(){
        isOn=false;
        System.out.println("Turn off AC");
    }
    public void setTemperature(int temp){
        temperature=temp;
    }
}
