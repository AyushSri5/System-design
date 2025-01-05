public class Main extends Super{
    public static void main(String[] args) {
        Super obj=new Sub();
        obj.normal();
    }

    @Override
    public void abs() {
        System.out.println("Method of abstract class");
    }
}
