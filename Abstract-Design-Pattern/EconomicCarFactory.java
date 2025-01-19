public class EconomicCarFactory implements AbstractCarFactory{
    @Override
    public Car getInstance(int price) {
        if(price<20000){
            return new EconomicCar1();
        }
        else if(price>20000){
            return new EconomicCar2();
        }
        return null;
    }
}
