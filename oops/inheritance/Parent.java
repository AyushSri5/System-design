public class Parent {
    String name;
    String model;
    int no_of_tyres;

    public Parent(String name,String model,int no_of_tyres){
        this.name=name;
        this.model=model;
        this.no_of_tyres=no_of_tyres;
    }

    public void start_engine(){
        System.out.println("Start the engine");
    }
    public void stop_engine(){
        System.out.println("Stopping the engine");
    }
}
