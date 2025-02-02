public class Mushroom extends ToppingDecorator{
    BasePizza pizza;
    public Mushroom(BasePizza basePizza){
        pizza=basePizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
