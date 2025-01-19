public class Main {
    public static void main(String[] args) {
        AbstractCarProducer producer=new AbstractCarProducer();
        AbstractCarFactory factory=producer.getFactory("Economic");
        Car carObj= factory.getInstance(25000);
        System.out.println(carObj.getTopSpeed());
    }
}
