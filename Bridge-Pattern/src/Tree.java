public class Tree extends LivingThings{

    public Tree(BreatheImplementor livingThings) {
        super(livingThings);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
