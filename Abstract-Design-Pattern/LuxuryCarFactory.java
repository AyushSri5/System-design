public class LuxuryCarFactory implements AbstractCarFactory{
    @Override
    public Car getInstance(int price) {
        if(price<50000){
            return new LuxuryCar1();
        }
        else if(price>50000){
            return new LuxuryCar2();
        }
        return null;
    }
}
