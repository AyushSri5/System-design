public class App {
    public static void main(String[] args) {
        Encapsulation ep= new Encapsulation(1,22);
        System.out.println(ep.getter());
        ep.setter(23);
        System.out.println(ep.getter());
    }
}
