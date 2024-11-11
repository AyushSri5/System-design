public class Car extends Parent{
    int no_of_doors;
    String transmission_type;
    public Car(String name,String model,int no,int no2,String trans){
        super(name,model,no);
        no_of_doors=no2;
        transmission_type=trans;
    }

    public void start_ac(){
        System.out.println("Starting the AC");
    }
}
