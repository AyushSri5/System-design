public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();

        RemoteControl remoteControl=new RemoteControl();

        remoteControl.setCommand(new TurnAcOnCommand(airConditioner));
//        remoteControl.setCommand(new TurnAcOffCommand(airConditioner));
        remoteControl.pressButton();
    }
}
