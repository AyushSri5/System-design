public class Encapsulation {
    private int id;
    private int age;

    public Encapsulation(int i,int ag){
        id=i;
        age=ag;
    }

    public int getter(){
        return age;
    }

    public void setter(int age){
        this.age=age;
    }
}
