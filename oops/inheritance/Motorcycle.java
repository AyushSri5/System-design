public class Motorcycle extends Parent{
    String handleBar;
    String suspension;
    public Motorcycle(String n,String m,int no,String h,String s){
        super(n,m,no);
        handleBar=h;
        suspension=s;
    }

    public void wheelie(){
        System.out.println("Doing a wheelie");
    }
}
