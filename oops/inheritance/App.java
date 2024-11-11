public class App {
    public static void main(String[] args) {
        Parent ch1=new Parent("ABC","A",4);
        ch1.start_engine();
        ch1.stop_engine();
        Car ch2 = new Car("DEF","B",1,2,"SINGLE");
        ch2.start_ac();
    }
}
